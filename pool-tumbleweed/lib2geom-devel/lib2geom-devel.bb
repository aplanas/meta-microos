SUMMARY = "Development files for lib2geom"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require lib2geom."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.2.2"

RPM_NAME = "lib2geom-devel-1.2.2-2.3.aarch64.rpm"
RPM_HASH = "a5ba2172c911db13807f9720cdeff1faa5a3f5f58da111da8c257addb10d2b3bc1814a21d9bbb50d16ad3338a48c6783d20aed30a56ec460898ee478cc141bcf"

RPROVIDES:${PN} += "cmake-2Geom \
lib2geom-devel \
pkgconfig-2geom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib2geom1-2-0"

inherit rpm
