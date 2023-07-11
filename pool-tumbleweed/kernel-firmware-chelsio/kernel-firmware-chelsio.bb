SUMMARY = "Kernel firmware files for Chelsio network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Chelsio network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230620"

RPM_NAME = "kernel-firmware-chelsio-20230620-1.1.noarch.rpm"
RPM_HASH = "3788f1119761f5e53742e854837c382d70c6a55237186a9a70c577383ca09c07ad1138bbfd59ec26453c53cfb62455dde2342f25657ffe6192ec023447ec4f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cxgb3-firmware \
firmware-cxgb3/ael2005-opt-edc.bin \
firmware-cxgb3/ael2005-twx-edc.bin \
firmware-cxgb3/ael2020-twx-edc.bin \
firmware-cxgb3/t3b-psram-1.1.0.bin \
firmware-cxgb3/t3c-psram-1.1.0.bin \
firmware-cxgb3/t3fw-7.0.0.bin \
firmware-cxgb3/t3fw-7.1.0.bin \
firmware-cxgb3/t3fw-7.10.0.bin \
firmware-cxgb3/t3fw-7.12.0.bin \
firmware-cxgb3/t3fw-7.4.0.bin \
firmware-cxgb4/aq1202-fw.cld \
firmware-cxgb4/bcm8483.bin \
firmware-cxgb4/configs/t4-config-default.txt \
firmware-cxgb4/configs/t5-config-default.txt \
firmware-cxgb4/configs/t5-config-hashfilter.txt \
firmware-cxgb4/configs/t6-config-default.txt \
firmware-cxgb4/configs/t6-config-hashfilter.txt \
firmware-cxgb4/t4-config.txt \
firmware-cxgb4/t4fw-1.14.4.0.bin \
firmware-cxgb4/t4fw-1.15.37.0.bin \
firmware-cxgb4/t4fw-1.27.3.0.bin \
firmware-cxgb4/t4fw.bin \
firmware-cxgb4/t5-config.txt \
firmware-cxgb4/t5fw-1.14.4.0.bin \
firmware-cxgb4/t5fw-1.15.37.0.bin \
firmware-cxgb4/t5fw-1.27.3.0.bin \
firmware-cxgb4/t5fw.bin \
firmware-cxgb4/t6-config.txt \
firmware-cxgb4/t6fw-1.27.3.0.bin \
firmware-cxgb4/t6fw.bin \
kernel-firmware-chelsio"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
