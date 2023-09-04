SUMMARY = "Kernel firmware files for Chelsio network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Chelsio network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-chelsio-20230814-1.1.noarch.rpm"
RPM_HASH = "8515f7810b5af797e07bd2bf677db9a07b4f4784990fd36492f5f34ea79531c5752435b1b878bc192ae7bd82e0dd875f9ff79c4dcd20e59368207a5ce586a5f4"
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
firmware-cxgb4/t4fw-1.27.4.0.bin \
firmware-cxgb4/t4fw.bin \
firmware-cxgb4/t5-config.txt \
firmware-cxgb4/t5fw-1.14.4.0.bin \
firmware-cxgb4/t5fw-1.15.37.0.bin \
firmware-cxgb4/t5fw-1.27.4.0.bin \
firmware-cxgb4/t5fw.bin \
firmware-cxgb4/t6-config.txt \
firmware-cxgb4/t6fw-1.27.4.0.bin \
firmware-cxgb4/t6fw.bin \
kernel-firmware-chelsio"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
