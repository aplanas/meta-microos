SUMMARY = "Kernel firmware files for Marvell Prestera ASIC driver"
DESCRIPTION = "This package contains compressed kernel firmware files for \
Marvell Prestera ASIC driver."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-prestera-20230814-1.1.noarch.rpm"
RPM_HASH = "2261b6f575abbcb251b14e7c14ad482d7b7cea776ab8fa119a475052dbabfaf4b3a9008749bd8c2b512012ddf9c103219fdb3edc9afe66fb313309f4eb97058a"
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
