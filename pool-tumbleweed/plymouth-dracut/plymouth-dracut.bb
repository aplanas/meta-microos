SUMMARY = "Plymouth related utilities for dracut"
DESCRIPTION = "This package contains utilities that integrate dracut with Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-dracut-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "047feef6ad5edda6330551e973e5eeb53d8e22d093f3735bd80299437932b31354a8d8a2dfeb853dd7317c2c7b22462a7923a2d45a0ecc4e735f46536e823be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
plymouth"

inherit rpm
