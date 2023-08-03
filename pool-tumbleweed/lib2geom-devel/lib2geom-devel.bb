SUMMARY = "Development files for lib2geom"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require lib2geom."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.3.0"

RPM_NAME = "lib2geom-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "2fba451df227164e37e8283a7e3a3cac69ba67599814bbdd40e2616221229731206f715888f4878092d62037c529c634d2e9754bd984c77c6307f74b4552d948"

RPROVIDES:${PN} += "cmake-2Geom \
lib2geom-devel \
pkgconfig-2geom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib2geom1-3-0"

inherit rpm
