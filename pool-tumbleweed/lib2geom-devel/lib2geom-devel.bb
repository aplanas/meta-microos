SUMMARY = "Development files for lib2geom"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require lib2geom."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.2.2"

RPM_NAME = "lib2geom-devel-1.2.2-2.4.aarch64.rpm"
RPM_HASH = "bba6359fa376ee94448d10308d4c3428d627ef207e8f80742be333209893a1aad2090bc12145cf5f20c7c5c8f603ba2f4feab26e41ffc3de086c64e0df79d948"

RPROVIDES:${PN} += "cmake-2Geom \
lib2geom-devel \
pkgconfig-2geom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib2geom1-2-0"

inherit rpm
