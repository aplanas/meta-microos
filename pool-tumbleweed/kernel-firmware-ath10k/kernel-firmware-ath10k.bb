SUMMARY = "Kernel firmware files for Atheros QCA988x WiFi drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Atheros QCA988x WiFi drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-ath10k-20230707-1.1.noarch.rpm"
RPM_HASH = "cb76d09c39f4a8e754a12db22779ad90f918f37f4d9baee934096eac43da50b26f3d36be582f596b4d9b6c0dc46ff0cc743529541635648d3c1132c0b94ab0c1"
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
