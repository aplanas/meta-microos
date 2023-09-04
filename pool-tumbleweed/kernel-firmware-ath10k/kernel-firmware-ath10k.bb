SUMMARY = "Kernel firmware files for Atheros QCA988x WiFi drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Atheros QCA988x WiFi drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-ath10k-20230814-1.1.noarch.rpm"
RPM_HASH = "c20609838dc620459f4ef8cea9ed852be99e8e13a1615fa08f0d1df174caf3026401101e4386c97cf7766786c67f735930fa5b9216af1ea4e6c221880db64b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-ath10k/QCA4019/hw1.0/board-2.bin \
firmware-ath10k/QCA4019/hw1.0/firmware-5.bin \
firmware-ath10k/QCA4019/hw1.0/notice-ath10k-firmware-5.txt \
firmware-ath10k/QCA6174/hw2.1/board-2.bin \
firmware-ath10k/QCA6174/hw2.1/board.bin \
firmware-ath10k/QCA6174/hw2.1/firmware-5.bin \
firmware-ath10k/QCA6174/hw2.1/notice-ath10k-firmware-5.txt \
firmware-ath10k/QCA6174/hw3.0/board-2.bin \
firmware-ath10k/QCA6174/hw3.0/board.bin \
firmware-ath10k/QCA6174/hw3.0/firmware-4.bin \
firmware-ath10k/QCA6174/hw3.0/firmware-6.bin \
firmware-ath10k/QCA6174/hw3.0/firmware-sdio-6.bin \
firmware-ath10k/QCA6174/hw3.0/notice-ath10k-firmware-4.txt \
firmware-ath10k/QCA6174/hw3.0/notice-ath10k-firmware-6.txt \
firmware-ath10k/QCA6174/hw3.0/notice-ath10k-firmware-sdio-6.txt \
firmware-ath10k/QCA9377/hw1.0/board-2.bin \
firmware-ath10k/QCA9377/hw1.0/board.bin \
firmware-ath10k/QCA9377/hw1.0/firmware-5.bin \
firmware-ath10k/QCA9377/hw1.0/firmware-6.bin \
firmware-ath10k/QCA9377/hw1.0/firmware-sdio-5.bin \
firmware-ath10k/QCA9377/hw1.0/notice-ath10k-firmware-5.txt \
firmware-ath10k/QCA9377/hw1.0/notice-ath10k-firmware-6.txt \
firmware-ath10k/QCA9377/hw1.0/notice-ath10k-firmware-sdio-5.txt \
firmware-ath10k/QCA9887/hw1.0/board.bin \
firmware-ath10k/QCA9887/hw1.0/firmware-5.bin \
firmware-ath10k/QCA9887/hw1.0/notice-ath10k-firmware-5.txt \
firmware-ath10k/QCA9888/hw2.0/board-2.bin \
firmware-ath10k/QCA9888/hw2.0/firmware-5.bin \
firmware-ath10k/QCA9888/hw2.0/notice-ath10k-firmware-5.txt \
firmware-ath10k/QCA988X/hw2.0/board.bin \
firmware-ath10k/QCA988X/hw2.0/firmware-4.bin \
firmware-ath10k/QCA988X/hw2.0/firmware-5.bin \
firmware-ath10k/QCA988X/hw2.0/notice-ath10k-firmware-4.txt \
firmware-ath10k/QCA988X/hw2.0/notice-ath10k-firmware-5.txt \
firmware-ath10k/QCA9984/hw1.0/board-2.bin \
firmware-ath10k/QCA9984/hw1.0/firmware-5.bin \
firmware-ath10k/QCA9984/hw1.0/notice-ath10k-firmware-5.txt \
firmware-ath10k/QCA99X0/hw2.0/board-2.bin \
firmware-ath10k/QCA99X0/hw2.0/firmware-5.bin \
firmware-ath10k/QCA99X0/hw2.0/notice-ath10k-firmware-5.txt \
firmware-ath10k/WCN3990/hw1.0/board-2.bin \
firmware-ath10k/WCN3990/hw1.0/firmware-5.bin \
firmware-ath10k/WCN3990/hw1.0/notice.txt-wlanmdsp \
firmware-ath10k/WCN3990/hw1.0/wlanmdsp.mbn \
firmware-qcom/sdm845/wlanmdsp.mbn \
kernel-firmware-ath10k"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
