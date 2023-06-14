SUMMARY = "Development headers for libalternatives"
DESCRIPTION = "This package contains development headers and library for libalternatives."
LICENSE = "Apache-2.0"

PV = "1.2+30.a5431e9"

RPM_NAME = "libalternatives-devel-1.2+30.a5431e9-1.1.aarch64.rpm"
RPM_HASH = "e24b17108ebcb332f269a13f9fb3e2136812321397ceadfde95c250b5cfd19dd1e249acc2dd7e8c36c61ced3ed4ab71b744abd2654e16181763e373508ea507d"

RPROVIDES:${PN} += "cmake-libalternatives \
libalternatives-devel \
pkgconfig-libalternatives"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libalternatives1"

inherit rpm
