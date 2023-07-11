SUMMARY = "Development files for tins"
DESCRIPTION = "This package contains header files, and libraries needed to develop \
application that use libtins."
LICENSE = "BSD-2-Clause"

PV = "4.4"

RPM_NAME = "libtins-devel-4.4-2.2.aarch64.rpm"
RPM_HASH = "bb4c1412c6b3611d3aabbb90f50c958bc52d2ba7ff56296b178c1ea657f19477e09b6e4b2aa35812049ecc5bedc47c3937eca0e7b835c93f8a400590164e0224"

RPROVIDES:${PN} += "cmake-libtins \
libtins-devel \
pkgconfig-libtins"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcap-devel \
libtins4-4"

inherit rpm
