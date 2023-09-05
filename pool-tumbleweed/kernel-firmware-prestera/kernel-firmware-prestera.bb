SUMMARY = "Kernel firmware files for Marvell Prestera ASIC driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell Prestera ASIC driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230829"

RPM_NAME = "kernel-firmware-prestera-20230829-1.1.noarch.rpm"
RPM_HASH = "3581c2700084240e0854bb969be71eb906aae942c0c5f43d0c8d38011568939d5ee7d4f24b1ded086e460b46f7d140b59d7db15095b8688de256cd317dac57dc"
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
