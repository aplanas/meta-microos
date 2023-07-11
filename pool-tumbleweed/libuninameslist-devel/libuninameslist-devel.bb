SUMMARY = "Header files for libuninameslist"
DESCRIPTION = "This package contains header files for libuninameslist."
LICENSE = "BSD-3-Clause"

PV = "20230523"

RPM_NAME = "libuninameslist-devel-20230523-1.1.aarch64.rpm"
RPM_HASH = "87c1fa00bdca2ee1b94b279ad722b22e1eada86abbee7d2711a34da6bb36b2d43e206c4f273e97ff908717339abc7a83ab1f3d91603be683ee49e1bbb12dee3d"

RPROVIDES:${PN} += "libuninameslist-devel \
pkgconfig-libuninameslist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuninameslist1"

inherit rpm
