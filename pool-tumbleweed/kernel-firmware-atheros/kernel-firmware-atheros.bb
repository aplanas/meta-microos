SUMMARY = "Kernel firmware files for Atheros wireless drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Atheros wireless drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230620"

RPM_NAME = "kernel-firmware-atheros-20230620-1.1.noarch.rpm"
RPM_HASH = "32918a088670cb248a63fd0c296b623cadd0f0982704eb21a37f9f52f17ee804bd552f10d9d2ae80effe52f4cb71519b1079c5390e118969affd792e8e2ed8cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ath3k-firmware \
firmware-ar3k/1020200/PS-ASIC.pst \
firmware-ar3k/1020200/RamPatch.txt \
firmware-ar3k/1020200/ar3kbdaddr.pst \
firmware-ar3k/1020201/PS-ASIC.pst \
firmware-ar3k/1020201/RamPatch.txt \
firmware-ar3k/1020201coex/ramps-0x01020201-26-HighPriority.dfu \
firmware-ar3k/30000/PS-ASIC.pst \
firmware-ar3k/30000/RamPatch.txt \
firmware-ar3k/30000/ar3kbdaddr.pst \
firmware-ar3k/30101/PS-ASIC.pst \
firmware-ar3k/30101/RamPatch.txt \
firmware-ar3k/30101/ar3kbdaddr.pst \
firmware-ar3k/30101coex/PS-ASIC-aclHighPri.pst \
firmware-ar3k/30101coex/PS-ASIC-aclLowPri.pst \
firmware-ar3k/30101coex/PS-ASIC.pst \
firmware-ar3k/30101coex/RamPatch.txt \
firmware-ar3k/30101coex/ar3kbdaddr.pst \
firmware-ar3k/AthrBT-0x01020001.dfu \
firmware-ar3k/AthrBT-0x01020200.dfu \
firmware-ar3k/AthrBT-0x01020201.dfu \
firmware-ar3k/AthrBT-0x11020000.dfu \
firmware-ar3k/AthrBT-0x11020100.dfu \
firmware-ar3k/AthrBT-0x31010000.dfu \
firmware-ar3k/AthrBT-0x31010100.dfu \
firmware-ar3k/AthrBT-0x41020000.dfu \
firmware-ar3k/ramps-0x01020001-26.dfu \
firmware-ar3k/ramps-0x01020200-26.dfu \
firmware-ar3k/ramps-0x01020200-40.dfu \
firmware-ar3k/ramps-0x01020201-26.dfu \
firmware-ar3k/ramps-0x01020201-40.dfu \
firmware-ar3k/ramps-0x11020000-40.dfu \
firmware-ar3k/ramps-0x11020100-40.dfu \
firmware-ar3k/ramps-0x31010000-40.dfu \
firmware-ar3k/ramps-0x31010100-40.dfu \
firmware-ar3k/ramps-0x41020000-40.dfu \
firmware-ar5523.bin \
firmware-ar7010-1-1.fw \
firmware-ar7010.fw \
firmware-ar9170-1.fw \
firmware-ar9170-2.fw \
firmware-ar9271.fw \
firmware-ath3k-1.fw \
firmware-ath6k/AR6002/athwlan.bin.z77 \
firmware-ath6k/AR6002/data.patch.hw2-0.bin \
firmware-ath6k/AR6002/eeprom.bin \
firmware-ath6k/AR6002/eeprom.data \
firmware-ath6k/AR6003.1/hw2.1.1/athwlan.bin \
firmware-ath6k/AR6003.1/hw2.1.1/bdata.SD31.bin \
firmware-ath6k/AR6003.1/hw2.1.1/bdata.SD32.bin \
firmware-ath6k/AR6003.1/hw2.1.1/bdata.WB31.bin \
firmware-ath6k/AR6003.1/hw2.1.1/data.patch.bin \
firmware-ath6k/AR6003.1/hw2.1.1/endpointping.bin \
firmware-ath6k/AR6003.1/hw2.1.1/otp.bin \
firmware-ath6k/AR6003/hw1.0/athwlan.bin.z77 \
firmware-ath6k/AR6003/hw1.0/bdata.SD31.bin \
firmware-ath6k/AR6003/hw1.0/bdata.SD32.bin \
firmware-ath6k/AR6003/hw1.0/bdata.WB31.bin \
firmware-ath6k/AR6003/hw1.0/data.patch.bin \
firmware-ath6k/AR6003/hw1.0/otp.bin.z77 \
firmware-ath6k/AR6003/hw2.0/athwlan.bin.z77 \
firmware-ath6k/AR6003/hw2.0/bdata.SD31.bin \
firmware-ath6k/AR6003/hw2.0/bdata.SD32.bin \
firmware-ath6k/AR6003/hw2.0/bdata.WB31.bin \
firmware-ath6k/AR6003/hw2.0/data.patch.bin \
firmware-ath6k/AR6003/hw2.0/otp.bin.z77 \
firmware-ath6k/AR6003/hw2.1.1/athwlan.bin \
firmware-ath6k/AR6003/hw2.1.1/bdata.SD31.bin \
firmware-ath6k/AR6003/hw2.1.1/bdata.SD32.bin \
firmware-ath6k/AR6003/hw2.1.1/bdata.WB31.bin \
firmware-ath6k/AR6003/hw2.1.1/data.patch.bin \
firmware-ath6k/AR6003/hw2.1.1/endpointping.bin \
firmware-ath6k/AR6003/hw2.1.1/fw-2.bin \
firmware-ath6k/AR6003/hw2.1.1/fw-3.bin \
firmware-ath6k/AR6003/hw2.1.1/otp.bin \
firmware-ath6k/AR6004/hw1.2/bdata.bin \
firmware-ath6k/AR6004/hw1.2/fw-2.bin \
firmware-ath6k/AR6004/hw1.3/bdata.bin \
firmware-ath6k/AR6004/hw1.3/fw-3.bin \
firmware-ath9k-htc/htc-7010-1.4.0.fw \
firmware-ath9k-htc/htc-9271-1.4.0.fw \
firmware-carl9170-1.fw \
firmware-htc-7010.fw \
firmware-htc-9271.fw \
firmware-wil6210.brd \
firmware-wil6210.fw \
kernel-firmware-atheros"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
