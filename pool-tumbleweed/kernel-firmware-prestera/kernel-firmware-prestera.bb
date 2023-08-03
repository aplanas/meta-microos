SUMMARY = "Kernel firmware files for Marvell Prestera ASIC driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell Prestera ASIC driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-prestera-20230724-1.1.noarch.rpm"
RPM_HASH = "1a16184a21ef057ca80d520027d8c0b45e29a3a1a008209ed744de8a4101a6890031ca4df329647434ebe5ea44559a16099a8b5508c9e629f474b30bc5ceeb91"
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
