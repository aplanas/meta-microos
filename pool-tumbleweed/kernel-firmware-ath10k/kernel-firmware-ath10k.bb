SUMMARY = "Kernel firmware files for Atheros QCA988x WiFi drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Atheros QCA988x WiFi drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-ath10k-20230829-1.1.noarch.rpm"
RPM_HASH = "27943843be34c81a26227d05582dade641e09acb076938bd218906bed597dc2bb051d4228d1f07df1db0b0a2d826b518b175528685ae1b0f917d5b7383e922de"
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
