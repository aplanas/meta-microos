SUMMARY = "Kernel firmware files for Atheros Qualcomm WiFi drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Atheros Qualcomm WiFi drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-ath11k-20230724-1.1.noarch.rpm"
RPM_HASH = "17a2b7eab3bf15056173898a7a75a8e0ad8bde3bc3202090426b0ce32e927ec52c75bce460fd78aad0474d7d8a0c568c1ec9d0b122ff5003a14f60d52cba5798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ath11k/IPQ5018/hw1.0/Notice.txt \
firmware-ath11k/IPQ5018/hw1.0/board-2.bin \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.b00 \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.b01 \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.b02 \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.flist \
firmware-ath11k/IPQ5018/hw1.0/m3-fw.mdt \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b00 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b01 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b02 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b03 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b04 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b05 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b07 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b08 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b09 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b10 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b11 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b13 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.b14 \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.flist \
firmware-ath11k/IPQ5018/hw1.0/q6-fw.mdt \
firmware-ath11k/IPQ6018/hw1.0/Notice.txt \
firmware-ath11k/IPQ6018/hw1.0/board-2.bin \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.b00 \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.b01 \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.b02 \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.flist \
firmware-ath11k/IPQ6018/hw1.0/m3-fw.mdt \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b00 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b01 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b02 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b03 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b04 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b05 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b07 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.b08 \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.flist \
firmware-ath11k/IPQ6018/hw1.0/q6-fw.mdt \
firmware-ath11k/IPQ8074/hw2.0/Notice.txt \
firmware-ath11k/IPQ8074/hw2.0/board-2.bin \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.b00 \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.b01 \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.b02 \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.flist \
firmware-ath11k/IPQ8074/hw2.0/m3-fw.mdt \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b00 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b01 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b02 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b03 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b04 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b05 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b07 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.b08 \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.flist \
firmware-ath11k/IPQ8074/hw2.0/q6-fw.mdt \
firmware-ath11k/QCA6390/hw2.0/Notice.txt \
firmware-ath11k/QCA6390/hw2.0/amss.bin \
firmware-ath11k/QCA6390/hw2.0/board-2.bin \
firmware-ath11k/QCA6390/hw2.0/m3.bin \
firmware-ath11k/QCN9074/hw1.0/Notice.txt \
firmware-ath11k/QCN9074/hw1.0/amss.bin \
firmware-ath11k/QCN9074/hw1.0/board-2.bin \
firmware-ath11k/QCN9074/hw1.0/m3.bin \
firmware-ath11k/WCN6750/hw1.0/Notice.txt \
firmware-ath11k/WCN6750/hw1.0/board-2.bin \
firmware-ath11k/WCN6750/hw1.0/wpss.b00 \
firmware-ath11k/WCN6750/hw1.0/wpss.b01 \
firmware-ath11k/WCN6750/hw1.0/wpss.b02 \
firmware-ath11k/WCN6750/hw1.0/wpss.b03 \
firmware-ath11k/WCN6750/hw1.0/wpss.b04 \
firmware-ath11k/WCN6750/hw1.0/wpss.b05 \
firmware-ath11k/WCN6750/hw1.0/wpss.b06 \
firmware-ath11k/WCN6750/hw1.0/wpss.b07 \
firmware-ath11k/WCN6750/hw1.0/wpss.b08 \
firmware-ath11k/WCN6750/hw1.0/wpss.mdt \
firmware-ath11k/WCN6855/hw2.0/Notice.txt \
firmware-ath11k/WCN6855/hw2.0/amss.bin \
firmware-ath11k/WCN6855/hw2.0/board-2.bin \
firmware-ath11k/WCN6855/hw2.0/m3.bin \
firmware-ath11k/WCN6855/hw2.0/regdb.bin \
firmware-ath11k/WCN6855/hw2.1/amss.bin \
firmware-ath11k/WCN6855/hw2.1/board-2.bin \
firmware-ath11k/WCN6855/hw2.1/m3.bin \
firmware-ath11k/WCN6855/hw2.1/regdb.bin \
kernel-firmware-ath11k"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
