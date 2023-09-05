SUMMARY = "Development files for lib2geom"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require lib2geom."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.3.0"

RPM_NAME = "lib2geom-devel-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "08b2db7a86823eca2524fd76c574d8c8ee0d29e39d06aa0144b0372dd74fad647a596ad953fce64bf0c10bbfbb8bf7aedd815f42c9aadb9a1446564b6cf67c9c"

RPROVIDES:${PN} += "cmake-2Geom \
lib2geom-devel \
pkgconfig-2geom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib2geom1-3-0"

inherit rpm
