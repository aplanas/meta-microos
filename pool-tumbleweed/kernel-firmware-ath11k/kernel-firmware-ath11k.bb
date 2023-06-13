SUMMARY = "Kernel firmware files for Atheros Qualcomm WiFi drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Atheros Qualcomm WiFi drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-ath11k-20230517-1.1.noarch.rpm"
RPM_HASH = "f67f2eeb1c05bff215345be24c9ea3bcdd1d45f7f1fd41d201fd388a44cb8a986bb53883c2759f26a576d710b3cc95fbf09b9f594e8cd8a1268ad031979e6c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware(ath11k/IPQ5018/hw1.0/Notice.txt) \
firmware(ath11k/IPQ5018/hw1.0/board-2.bin) \
firmware(ath11k/IPQ5018/hw1.0/m3_fw.b00) \
firmware(ath11k/IPQ5018/hw1.0/m3_fw.b01) \
firmware(ath11k/IPQ5018/hw1.0/m3_fw.b02) \
firmware(ath11k/IPQ5018/hw1.0/m3_fw.flist) \
firmware(ath11k/IPQ5018/hw1.0/m3_fw.mdt) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b00) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b01) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b02) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b03) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b04) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b05) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b07) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b08) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b09) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b10) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b11) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b13) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.b14) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.flist) \
firmware(ath11k/IPQ5018/hw1.0/q6_fw.mdt) \
firmware(ath11k/IPQ6018/hw1.0/Notice.txt) \
firmware(ath11k/IPQ6018/hw1.0/board-2.bin) \
firmware(ath11k/IPQ6018/hw1.0/m3_fw.b00) \
firmware(ath11k/IPQ6018/hw1.0/m3_fw.b01) \
firmware(ath11k/IPQ6018/hw1.0/m3_fw.b02) \
firmware(ath11k/IPQ6018/hw1.0/m3_fw.flist) \
firmware(ath11k/IPQ6018/hw1.0/m3_fw.mdt) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.b00) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.b01) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.b02) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.b03) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.b04) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.b05) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.b07) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.b08) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.flist) \
firmware(ath11k/IPQ6018/hw1.0/q6_fw.mdt) \
firmware(ath11k/IPQ8074/hw2.0/Notice.txt) \
firmware(ath11k/IPQ8074/hw2.0/board-2.bin) \
firmware(ath11k/IPQ8074/hw2.0/m3_fw.b00) \
firmware(ath11k/IPQ8074/hw2.0/m3_fw.b01) \
firmware(ath11k/IPQ8074/hw2.0/m3_fw.b02) \
firmware(ath11k/IPQ8074/hw2.0/m3_fw.flist) \
firmware(ath11k/IPQ8074/hw2.0/m3_fw.mdt) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.b00) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.b01) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.b02) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.b03) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.b04) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.b05) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.b07) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.b08) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.flist) \
firmware(ath11k/IPQ8074/hw2.0/q6_fw.mdt) \
firmware(ath11k/QCA6390/hw2.0/Notice.txt) \
firmware(ath11k/QCA6390/hw2.0/amss.bin) \
firmware(ath11k/QCA6390/hw2.0/board-2.bin) \
firmware(ath11k/QCA6390/hw2.0/m3.bin) \
firmware(ath11k/QCN9074/hw1.0/Notice.txt) \
firmware(ath11k/QCN9074/hw1.0/amss.bin) \
firmware(ath11k/QCN9074/hw1.0/board-2.bin) \
firmware(ath11k/QCN9074/hw1.0/m3.bin) \
firmware(ath11k/WCN6750/hw1.0/Notice.txt) \
firmware(ath11k/WCN6750/hw1.0/board-2.bin) \
firmware(ath11k/WCN6750/hw1.0/wpss.b00) \
firmware(ath11k/WCN6750/hw1.0/wpss.b01) \
firmware(ath11k/WCN6750/hw1.0/wpss.b02) \
firmware(ath11k/WCN6750/hw1.0/wpss.b03) \
firmware(ath11k/WCN6750/hw1.0/wpss.b04) \
firmware(ath11k/WCN6750/hw1.0/wpss.b05) \
firmware(ath11k/WCN6750/hw1.0/wpss.b06) \
firmware(ath11k/WCN6750/hw1.0/wpss.b07) \
firmware(ath11k/WCN6750/hw1.0/wpss.b08) \
firmware(ath11k/WCN6750/hw1.0/wpss.mdt) \
firmware(ath11k/WCN6855/hw2.0/Notice.txt) \
firmware(ath11k/WCN6855/hw2.0/amss.bin) \
firmware(ath11k/WCN6855/hw2.0/board-2.bin) \
firmware(ath11k/WCN6855/hw2.0/m3.bin) \
firmware(ath11k/WCN6855/hw2.0/regdb.bin) \
firmware(ath11k/WCN6855/hw2.1/amss.bin) \
firmware(ath11k/WCN6855/hw2.1/board-2.bin) \
firmware(ath11k/WCN6855/hw2.1/m3.bin) \
firmware(ath11k/WCN6855/hw2.1/regdb.bin) \
kernel-firmware-ath11k"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
dracut"

inherit rpm
