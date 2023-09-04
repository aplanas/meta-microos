SUMMARY = "Development files for dpkg"
DESCRIPTION = "Libraries and header files for dpkg."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.22"

RPM_NAME = "dpkg-devel-1.21.22-1.2.aarch64.rpm"
RPM_HASH = "b13e31d13229cabae46c0d908c1952e95232e6ca4fe44c3d1eb875a529a823176f401b4e93ac83e426946f84477b760ef4208c98e7b87d82471a99bb692bb4a5"

RPROVIDES:${PN} += "deb-devel \
dpkg-devel \
pkgconfig-libdpkg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dpkg \
libmd-devel"

inherit rpm
