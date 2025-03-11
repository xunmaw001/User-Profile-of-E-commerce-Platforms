package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 商品
 *
 * @author 
 * @email
 */
@TableName("goods")
public class GoodsEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GoodsEntity() {

	}

	public GoodsEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 商品编号
     */
    @TableField(value = "goods_uuid_number")

    private String goodsUuidNumber;


    /**
     * 商品名称
     */
    @TableField(value = "goods_name")

    private String goodsName;


    /**
     * 商品照片
     */
    @TableField(value = "goods_photo")

    private String goodsPhoto;


    /**
     * 品牌
     */
    @TableField(value = "goods_pinpai")

    private String goodsPinpai;


    /**
     * 商品类型
     */
    @TableField(value = "goods_types")

    private Integer goodsTypes;


    /**
     * 商品库存
     */
    @TableField(value = "goods_kucun_number")

    private Integer goodsKucunNumber;


    /**
     * 商品原价
     */
    @TableField(value = "goods_old_money")

    private Double goodsOldMoney;


    /**
     * 现价
     */
    @TableField(value = "goods_new_money")

    private Double goodsNewMoney;


    /**
     * 点击次数
     */
    @TableField(value = "goods_clicknum")

    private Integer goodsClicknum;


    /**
     * 商品介绍
     */
    @TableField(value = "goods_content")

    private String goodsContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "goods_delete")

    private Integer goodsDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商品编号
	 */
    public String getGoodsUuidNumber() {
        return goodsUuidNumber;
    }
    /**
	 * 获取：商品编号
	 */

    public void setGoodsUuidNumber(String goodsUuidNumber) {
        this.goodsUuidNumber = goodsUuidNumber;
    }
    /**
	 * 设置：商品名称
	 */
    public String getGoodsName() {
        return goodsName;
    }
    /**
	 * 获取：商品名称
	 */

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    /**
	 * 设置：商品照片
	 */
    public String getGoodsPhoto() {
        return goodsPhoto;
    }
    /**
	 * 获取：商品照片
	 */

    public void setGoodsPhoto(String goodsPhoto) {
        this.goodsPhoto = goodsPhoto;
    }
    /**
	 * 设置：品牌
	 */
    public String getGoodsPinpai() {
        return goodsPinpai;
    }
    /**
	 * 获取：品牌
	 */

    public void setGoodsPinpai(String goodsPinpai) {
        this.goodsPinpai = goodsPinpai;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getGoodsTypes() {
        return goodsTypes;
    }
    /**
	 * 获取：商品类型
	 */

    public void setGoodsTypes(Integer goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getGoodsKucunNumber() {
        return goodsKucunNumber;
    }
    /**
	 * 获取：商品库存
	 */

    public void setGoodsKucunNumber(Integer goodsKucunNumber) {
        this.goodsKucunNumber = goodsKucunNumber;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getGoodsOldMoney() {
        return goodsOldMoney;
    }
    /**
	 * 获取：商品原价
	 */

    public void setGoodsOldMoney(Double goodsOldMoney) {
        this.goodsOldMoney = goodsOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getGoodsNewMoney() {
        return goodsNewMoney;
    }
    /**
	 * 获取：现价
	 */

    public void setGoodsNewMoney(Double goodsNewMoney) {
        this.goodsNewMoney = goodsNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getGoodsClicknum() {
        return goodsClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setGoodsClicknum(Integer goodsClicknum) {
        this.goodsClicknum = goodsClicknum;
    }
    /**
	 * 设置：商品介绍
	 */
    public String getGoodsContent() {
        return goodsContent;
    }
    /**
	 * 获取：商品介绍
	 */

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getGoodsDelete() {
        return goodsDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setGoodsDelete(Integer goodsDelete) {
        this.goodsDelete = goodsDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Goods{" +
            "id=" + id +
            ", goodsUuidNumber=" + goodsUuidNumber +
            ", goodsName=" + goodsName +
            ", goodsPhoto=" + goodsPhoto +
            ", goodsPinpai=" + goodsPinpai +
            ", goodsTypes=" + goodsTypes +
            ", goodsKucunNumber=" + goodsKucunNumber +
            ", goodsOldMoney=" + goodsOldMoney +
            ", goodsNewMoney=" + goodsNewMoney +
            ", goodsClicknum=" + goodsClicknum +
            ", goodsContent=" + goodsContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", goodsDelete=" + goodsDelete +
            ", createTime=" + createTime +
        "}";
    }
}
