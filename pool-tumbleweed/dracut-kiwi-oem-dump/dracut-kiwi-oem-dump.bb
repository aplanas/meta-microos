SUMMARY = "KIWI - Dracut module for oem(install) image type"
DESCRIPTION = "This package contains the kiwi-dump and kiwi-dump-reboot dracut \
modules which is used to install an oem image onto a target disk. \
It implements a simple installer which allows for user selected \
target disk or unattended installation to target. The source of \
the image to install could be either from media(CD/DVD/USB) or \
from remote"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-oem-dump-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "907b5edfe350de3a928581a464685a5436a68362a2b8913b6e9e5251c027e16bea29705a3ad0915e5fcdd1edd34601df95ae27988e79de86d11c9de639c9f024"

RPROVIDES:${PN} += "dracut-kiwi-oem-dump"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut-kiwi-lib \
gawk \
kexec-tools \
kpartx"

inherit rpm
