SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require these."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "liboggz-devel-1.1.1-15.29.aarch64.rpm"
RPM_HASH = "a26a68c367140eadde3d250692974521374a66d0835f1c9548556a1f7a50b62bd9a4ecaf9930527988d3b4e90fc8f096411e9c4b3703e931f744caca8bac9aff"

RPROVIDES:${PN} += "liboggz-devel \
pkgconfig-oggz"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libogg-devel \
liboggz2 \
pkgconfig-ogg"

inherit rpm
