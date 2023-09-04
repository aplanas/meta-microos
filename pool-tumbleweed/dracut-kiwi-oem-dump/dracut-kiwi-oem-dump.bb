SUMMARY = "KIWI - Dracut module for oem(install) image type"
DESCRIPTION = "This package contains the kiwi-dump and kiwi-dump-reboot dracut \
modules which is used to install an oem image onto a target disk. \
It implements a simple installer which allows for user selected \
target disk or unattended installation to target. The source of \
the image to install could be either from media(CD/DVD/USB) or \
from remote"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "dracut-kiwi-oem-dump-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "04abfe7b5d9c787340bec8049bc6c1dc3cb615a3a6c8411673274de7449ae27bb361997d2dd783bb4a8cdd17d98b771ec19046f1821c216a7e777bd79090dbe7"

RPROVIDES:${PN} += "dracut-kiwi-oem-dump"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut-kiwi-lib \
gawk \
kexec-tools \
kpartx"

inherit rpm
