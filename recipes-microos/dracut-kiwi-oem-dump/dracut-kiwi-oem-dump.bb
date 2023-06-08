SUMMARY = "KIWI - Dracut module for oem(install) image type"
DESCRIPTION = "This package contains the kiwi-dump and kiwi-dump-reboot dracut \
modules which is used to install an oem image onto a target disk. \
It implements a simple installer which allows for user selected \
target disk or unattended installation to target. The source of \
the image to install could be either from media(CD/DVD/USB) or \
from remote"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "dracut-kiwi-oem-dump-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "3c78c838c233773ee0384c7f1b48f53acf62aba501d3585b8abba65e28fd96053da27b4d6912cd0e9ffb937ddd1629f8cb33888fe334d5642da6a91812d2c4a3"

RPROVIDES:${PN} += "dracut-kiwi-oem-dump dracut-kiwi-oem-dump(aarch-64)"
RDEPENDS:${PN} += "/bin/bash dracut-kiwi-lib gawk kexec-tools kpartx"

inherit rpm
