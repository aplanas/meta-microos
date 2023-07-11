SUMMARY = "Kernel firmware files for various Bluetooth drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
various Bluetooth drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230620"

RPM_NAME = "kernel-firmware-bluetooth-20230620-1.1.noarch.rpm"
RPM_HASH = "380978c2bc9134a9cdd18f3e8460b6ef52abf03e4ab12637376810a9c2fce43db5894f5b788809b21760a5baf203fb25264dc805a2820434d0bab8167d267937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-intel/ibt-0040-0041.ddc \
firmware-intel/ibt-0040-0041.sfi \
firmware-intel/ibt-0040-1020.ddc \
firmware-intel/ibt-0040-1020.sfi \
firmware-intel/ibt-0040-2120.ddc \
firmware-intel/ibt-0040-2120.sfi \
firmware-intel/ibt-0040-4150.ddc \
firmware-intel/ibt-0040-4150.sfi \
firmware-intel/ibt-0041-0041.ddc \
firmware-intel/ibt-0041-0041.sfi \
firmware-intel/ibt-1040-0041.ddc \
firmware-intel/ibt-1040-0041.sfi \
firmware-intel/ibt-1040-1020.ddc \
firmware-intel/ibt-1040-1020.sfi \
firmware-intel/ibt-1040-2120.ddc \
firmware-intel/ibt-1040-2120.sfi \
firmware-intel/ibt-1040-4150.ddc \
firmware-intel/ibt-1040-4150.sfi \
firmware-intel/ibt-11-5.ddc \
firmware-intel/ibt-11-5.sfi \
firmware-intel/ibt-12-16.ddc \
firmware-intel/ibt-12-16.sfi \
firmware-intel/ibt-17-0-1.ddc \
firmware-intel/ibt-17-0-1.sfi \
firmware-intel/ibt-17-1.ddc \
firmware-intel/ibt-17-1.sfi \
firmware-intel/ibt-17-16-1.ddc \
firmware-intel/ibt-17-16-1.sfi \
firmware-intel/ibt-17-2.ddc \
firmware-intel/ibt-17-2.sfi \
firmware-intel/ibt-18-0-1.ddc \
firmware-intel/ibt-18-0-1.sfi \
firmware-intel/ibt-18-1.ddc \
firmware-intel/ibt-18-1.sfi \
firmware-intel/ibt-18-16-1.ddc \
firmware-intel/ibt-18-16-1.sfi \
firmware-intel/ibt-18-2.ddc \
firmware-intel/ibt-18-2.sfi \
firmware-intel/ibt-19-0-0.ddc \
firmware-intel/ibt-19-0-0.sfi \
firmware-intel/ibt-19-0-1.ddc \
firmware-intel/ibt-19-0-1.sfi \
firmware-intel/ibt-19-0-3.ddc \
firmware-intel/ibt-19-0-3.sfi \
firmware-intel/ibt-19-0-4.ddc \
firmware-intel/ibt-19-0-4.sfi \
firmware-intel/ibt-19-16-4.ddc \
firmware-intel/ibt-19-16-4.sfi \
firmware-intel/ibt-19-240-1.ddc \
firmware-intel/ibt-19-240-1.sfi \
firmware-intel/ibt-19-240-4.ddc \
firmware-intel/ibt-19-240-4.sfi \
firmware-intel/ibt-19-32-0.ddc \
firmware-intel/ibt-19-32-0.sfi \
firmware-intel/ibt-19-32-1.ddc \
firmware-intel/ibt-19-32-1.sfi \
firmware-intel/ibt-19-32-4.ddc \
firmware-intel/ibt-19-32-4.sfi \
firmware-intel/ibt-20-0-3.ddc \
firmware-intel/ibt-20-0-3.sfi \
firmware-intel/ibt-20-1-3.ddc \
firmware-intel/ibt-20-1-3.sfi \
firmware-intel/ibt-20-1-4.ddc \
firmware-intel/ibt-20-1-4.sfi \
firmware-intel/ibt-hw-37.7.10-fw-1.0.1.2d.d.bseq \
firmware-intel/ibt-hw-37.7.10-fw-1.0.2.3.d.bseq \
firmware-intel/ibt-hw-37.7.10-fw-1.80.1.2d.d.bseq \
firmware-intel/ibt-hw-37.7.10-fw-1.80.2.3.d.bseq \
firmware-intel/ibt-hw-37.7.bseq \
firmware-intel/ibt-hw-37.8.10-fw-1.10.2.27.d.bseq \
firmware-intel/ibt-hw-37.8.10-fw-1.10.3.11.e.bseq \
firmware-intel/ibt-hw-37.8.10-fw-22.50.19.14.f.bseq \
firmware-intel/ibt-hw-37.8.bseq \
firmware-qca/crbtfw21.tlv \
firmware-qca/crbtfw32.tlv \
firmware-qca/crnv21.bin \
firmware-qca/crnv32.bin \
firmware-qca/crnv32u.bin \
firmware-qca/hpbtfw21.tlv \
firmware-qca/hpnv21.301 \
firmware-qca/hpnv21.302 \
firmware-qca/hpnv21.bin \
firmware-qca/hpnv21g.301 \
firmware-qca/hpnv21g.302 \
firmware-qca/hpnv21g.bin \
firmware-qca/htbtfw20.tlv \
firmware-qca/htnv20.bin \
firmware-qca/msbtfw11.mbn \
firmware-qca/msbtfw11.tlv \
firmware-qca/msnv11.b09 \
firmware-qca/msnv11.b0a \
firmware-qca/msnv11.bin \
firmware-qca/nvm-00130300.bin \
firmware-qca/nvm-00130302.bin \
firmware-qca/nvm-00230302.bin \
firmware-qca/nvm-00440302-eu.bin \
firmware-qca/nvm-00440302-i2s-eu.bin \
firmware-qca/nvm-00440302.bin \
firmware-qca/nvm-usb-00000200.bin \
firmware-qca/nvm-usb-00000201.bin \
firmware-qca/nvm-usb-00000300.bin \
firmware-qca/nvm-usb-00000302-eu.bin \
firmware-qca/nvm-usb-00000302.bin \
firmware-qca/nvm-usb-00130200-0104.bin \
firmware-qca/nvm-usb-00130200-0105.bin \
firmware-qca/nvm-usb-00130200-0106.bin \
firmware-qca/nvm-usb-00130200-0107.bin \
firmware-qca/nvm-usb-00130200-0109.bin \
firmware-qca/nvm-usb-00130200-0110.bin \
firmware-qca/nvm-usb-00130200.bin \
firmware-qca/nvm-usb-00130201-010a.bin \
firmware-qca/nvm-usb-00130201-010b.bin \
firmware-qca/nvm-usb-00130201-0303.bin \
firmware-qca/nvm-usb-00130201-gf-010a.bin \
firmware-qca/nvm-usb-00130201-gf-010b.bin \
firmware-qca/nvm-usb-00130201-gf-0303.bin \
firmware-qca/nvm-usb-00130201-gf.bin \
firmware-qca/nvm-usb-00130201.bin \
firmware-qca/nvm-usb-00190200.bin \
firmware-qca/rampatch-00130300.bin \
firmware-qca/rampatch-00130302.bin \
firmware-qca/rampatch-00230302.bin \
firmware-qca/rampatch-00440302.bin \
firmware-qca/rampatch-usb-00000200.bin \
firmware-qca/rampatch-usb-00000201.bin \
firmware-qca/rampatch-usb-00000300.bin \
firmware-qca/rampatch-usb-00000302.bin \
firmware-qca/rampatch-usb-00130200.bin \
firmware-qca/rampatch-usb-00130201.bin \
firmware-qca/rampatch-usb-00190200.bin \
firmware-rtl-bt/rtl8192ee-fw.bin \
firmware-rtl-bt/rtl8192eu-fw.bin \
firmware-rtl-bt/rtl8723a-fw.bin \
firmware-rtl-bt/rtl8723b-fw.bin \
firmware-rtl-bt/rtl8723bs-config-OBDA0623.bin \
firmware-rtl-bt/rtl8723bs-config-OBDA8723.bin \
firmware-rtl-bt/rtl8723bs-fw.bin \
firmware-rtl-bt/rtl8723d-config.bin \
firmware-rtl-bt/rtl8723d-fw.bin \
firmware-rtl-bt/rtl8761a-fw.bin \
firmware-rtl-bt/rtl8761b-config.bin \
firmware-rtl-bt/rtl8761b-fw.bin \
firmware-rtl-bt/rtl8761bu-config.bin \
firmware-rtl-bt/rtl8761bu-fw.bin \
firmware-rtl-bt/rtl8812ae-fw.bin \
firmware-rtl-bt/rtl8821a-config.bin \
firmware-rtl-bt/rtl8821a-fw.bin \
firmware-rtl-bt/rtl8821c-config.bin \
firmware-rtl-bt/rtl8821c-fw.bin \
firmware-rtl-bt/rtl8821cs-config.bin \
firmware-rtl-bt/rtl8821cs-fw.bin \
firmware-rtl-bt/rtl8822b-config.bin \
firmware-rtl-bt/rtl8822b-fw.bin \
firmware-rtl-bt/rtl8822cs-config.bin \
firmware-rtl-bt/rtl8822cs-fw.bin \
firmware-rtl-bt/rtl8822cu-config.bin \
firmware-rtl-bt/rtl8822cu-fw.bin \
firmware-rtl-bt/rtl8851bu-config.bin \
firmware-rtl-bt/rtl8851bu-fw.bin \
firmware-rtl-bt/rtl8852au-config.bin \
firmware-rtl-bt/rtl8852au-fw.bin \
firmware-rtl-bt/rtl8852bu-config.bin \
firmware-rtl-bt/rtl8852bu-fw.bin \
firmware-rtl-bt/rtl8852cu-config.bin \
firmware-rtl-bt/rtl8852cu-fw.bin \
kernel-firmware-bluetooth"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
