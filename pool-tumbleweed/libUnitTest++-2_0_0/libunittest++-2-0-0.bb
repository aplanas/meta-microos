SUMMARY = "A unit testing framework for C++"
DESCRIPTION = "UnitTest++ is a unit testing framework for C++. It was designed \
to do test-driven development on a wide variety of platforms. \
UnitTest++ is mostly standard C++ and makes minimal use of \
advanced library and language features."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "libUnitTest++-2_0_0-2.0.0-2.4.aarch64.rpm"
RPM_HASH = "9b3825ee160d3d2ce341767b3e26b000bcd878b68ff389ff7c57c21c85760f96e185190afc7caa819ef9c32281cff399cc464e37146a3a8ca72138c5a24f3b2c"

RPROVIDES:${PN} += "libUnitTest++-2-0-0 \
libUnitTest++-2.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
