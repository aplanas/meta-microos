SUMMARY = "Development package for ibus-table"
DESCRIPTION = "This package contains the files required for the development of ibus-table."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17.0"

RPM_NAME = "ibus-table-devel-1.17.0-1.2.aarch64.rpm"
RPM_HASH = "8caa46de88c71ea5480865670dcd872dacecff3e1c15ef9ffdba01d788470455330efe6b3d2bc36f04c3f8d91f413528b250e9c3d64582240994686a05516337"

RPROVIDES:${PN} += "ibus-table-devel \
pkgconfig-ibus-table"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ibus-table"

inherit rpm
