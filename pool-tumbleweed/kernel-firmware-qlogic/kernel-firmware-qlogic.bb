SUMMARY = "Kernel firmware files for QLogic network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
QLogic network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-qlogic-20230829-1.1.noarch.rpm"
RPM_HASH = "1a9526c6f587cc4970b3211d2b9aa92b973a32c440df7cadb0abb57410c542314e2657c73138fd3a8e870d4d7a7ce68064be3c5e2cac84b7f08bba6aa45cf730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-cbfw-3.2.5.1.bin \
firmware-ct2fw-3.2.5.1.bin \
firmware-ctfw-3.2.5.1.bin \
firmware-qed/qed-init-values-8.10.9.0.bin \
firmware-qed/qed-init-values-8.14.6.0.bin \
firmware-qed/qed-init-values-8.18.9.0.bin \
firmware-qed/qed-init-values-8.20.0.0.bin \
firmware-qed/qed-init-values-8.30.12.0.bin \
firmware-qed/qed-init-values-8.33.12.0.bin \
firmware-qed/qed-init-values-8.37.7.0.bin \
firmware-qed/qed-init-values-8.40.33.0.bin \
firmware-qed/qed-init-values-zipped-8.10.10.0.bin \
firmware-qed/qed-init-values-zipped-8.10.5.0.bin \
firmware-qed/qed-init-values-zipped-8.15.3.0.bin \
firmware-qed/qed-init-values-zipped-8.20.0.0.bin \
firmware-qed/qed-init-values-zipped-8.33.1.0.bin \
firmware-qed/qed-init-values-zipped-8.33.11.0.bin \
firmware-qed/qed-init-values-zipped-8.37.2.0.bin \
firmware-qed/qed-init-values-zipped-8.37.7.0.bin \
firmware-qed/qed-init-values-zipped-8.4.2.0.bin \
firmware-qed/qed-init-values-zipped-8.42.2.0.bin \
firmware-qed/qed-init-values-zipped-8.59.1.0.bin \
firmware-qed/qed-init-values-zipped-8.7.3.0.bin \
firmware-ql2100-fw.bin \
firmware-ql2200-fw.bin \
firmware-ql2300-fw.bin \
firmware-ql2322-fw.bin \
firmware-ql2400-fw.bin \
firmware-ql2500-fw.bin \
firmware-ql2600-fw.bin \
firmware-ql2700-fw.bin \
firmware-ql8300-fw.bin \
firmware-qlogic/1040.bin \
firmware-qlogic/12160.bin \
firmware-qlogic/1280.bin \
firmware-qlogic/isp1000.bin \
firmware-qlogic/sd7220.fw \
kernel-firmware-qlogic \
qlogic-firmware"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
