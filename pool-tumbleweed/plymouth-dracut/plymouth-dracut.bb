SUMMARY = "Plymouth related utilities for dracut"
DESCRIPTION = "This package contains utilities that integrate dracut with Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-dracut-22.02.122+94.4bd41a3-9.1.noarch.rpm"
RPM_HASH = "3430fcb62889d3d251877725a2fcbe1b7f235855b85944ac3c451755e46f85f73f0034b9bb14c0d1ae9b5d43f4c2d33532721b156f5e1e219a1505b1df8b0ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
plymouth"

inherit rpm
