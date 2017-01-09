package com.thoth.domain;

import org.springframework.data.annotation.Id;

public class ThothOrder
{


    @Id
    private String id;

    /**
     * 用户标识
     */
    private String clientFlag;

    /**
     * 当前处理状态
     *
     *   0 接收数据 1 处理成功  9 thoth 处理失败 7 thoth响应 数据转换类型 8 微服务响应 数据转换类型
     */
    private Integer isSend;

    /**
     * 下单数据
     */
    private String dataOrder;
    /**
     * 客户服务名称
     */
    private String checkID;
    /**
     * 备用备注
     */
    private String remark;


    /**
     * 获取用户标识
     *
     * @return clientFlag 用户标识
     */
    public String getClientFlag() {
        return clientFlag;
    }




    /**
     * 设置用户标识
     *
     * @param clientFlag 用户标识
     */
    public void setClientFlag(String clientFlag) {
        this.clientFlag = clientFlag;
    }

    /**
     * 获取发送状态
     *
     * @return isSend 发送状态
     */
    public Integer getIsSend() {
        return isSend;
    }

    /**
     * 设置发送状态
     *
     * @param isSend 发送状态
     */
    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    /**
     * 获取下单数据
     *
     * @return dataOrder 下单数据
     */
    public String getDataOrder() {
        return dataOrder;
    }

    /**
     * 设置下单数据
     *
     * @param dataOrder 下单数据
     */
    public void setDataOrder(String dataOrder) {
        this.dataOrder = dataOrder;
    }

    /**
     * 获取备用备注
     *
     * @return remark 备用备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备用备注
     *
     * @param remark 备用备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * 获取 客户服务名称
     */
    public String getCheckID() {
        return this.checkID;
    }

    /**
     * 设置 客户服务名称
     */
    public void setCheckID(String checkID) {
        this.checkID = checkID;
    }


    @Id
    public String getId() {
        return this.id;
    }

    @Id
    public void setId(String id) {
        this.id = id;
    }
}