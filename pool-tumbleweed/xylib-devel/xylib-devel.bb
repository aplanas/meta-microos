SUMMARY = "Development files for xylib"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use xylib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "xylib-devel-1.6-1.16.aarch64.rpm"
RPM_HASH = "25b58cb9143437c8cfb7185a71bf3393962b4b8ade72f354c710f3e13a01609e911c85fb33d457b070c4ff5a148fec3aa1904cd5da951c8765211bb586bd7768"

RPROVIDES:${PN} += "xylib-devel"

RDEPENDS:${PN} += "libxy3"

inherit rpm
