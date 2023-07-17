SUMMARY = "Kernel firmware files for Chelsio network drivers"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Chelsio network drivers."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-chelsio-20230707-1.1.noarch.rpm"
RPM_HASH = "14ef1ce8a762c31c10d64c96acdc7d690642f2ab6f3678da1d4633ef17f7e143ae801afbb5a0ef6fbc7fac5393311bbb7a2db5de83ba403a95d414a15fe7cee3"
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
