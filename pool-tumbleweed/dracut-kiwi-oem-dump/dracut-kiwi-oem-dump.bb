SUMMARY = "KIWI - Dracut module for oem(install) image type"
DESCRIPTION = "This package contains the kiwi-dump and kiwi-dump-reboot dracut \
modules which is used to install an oem image onto a target disk. \
It implements a simple installer which allows for user selected \
target disk or unattended installation to target. The source of \
the image to install could be either from media(CD/DVD/USB) or \
from remote"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-oem-dump-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "d068d5213bd70b4276fe7a072e42f5f3b96aa802bd69096dade6d7fcc11476b9c2e44dfea3015388a6f1b91bd53eed10b60bc5a4fa4956d39a81001961b75f57"

RPROVIDES:${PN} += "dracut-kiwi-oem-dump"

RDEPENDS:${PN} += "/usr/bin/bash \
dracut-kiwi-lib \
gawk \
kexec-tools \
kpartx"

inherit rpm
