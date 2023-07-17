SUMMARY = "Kernel firmware files for Marvell Prestera ASIC driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell Prestera ASIC driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230707"

RPM_NAME = "kernel-firmware-prestera-20230707-1.1.noarch.rpm"
RPM_HASH = "f841bc34d114c00def045da2127c3bf03b67a1016503e157b4a06836405323b3b19a648d56117f24fda644bda821cc245e82c4e7edb47e3fc351bbaddc1a6ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firmware-mrvl/prestera/mvsw-prestera-fw-arm64-v4.1.img \
firmware-mrvl/prestera/mvsw-prestera-fw-v2.0.img \
firmware-mrvl/prestera/mvsw-prestera-fw-v3.0.img \
firmware-mrvl/prestera/mvsw-prestera-fw-v4.0.img \
firmware-mrvl/prestera/mvsw-prestera-fw-v4.1.img \
kernel-firmware-prestera"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut"

inherit rpm
