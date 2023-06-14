SUMMARY = "Development tools for the Parma Polyhedra Library C and C++ interfaces"
DESCRIPTION = "The header files, Autoconf macro, and ppl-config tool for developing \
applications using the Parma Polyhedra Library through its C and C++ \
interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-devel-1.2-3.1.aarch64.rpm"
RPM_HASH = "d1c8a1724cca1ac13aafdf200eaf82b3b3853dc52dc95ecc6f79741590a200541ed39e6345702093b54b17a2f436d7a098dadcbed6047ffa9ad09e0fb8b607b8"

RPROVIDES:${PN} += "ppl-devel"

RDEPENDS:${PN} += "gmp-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libppl-c4 \
libppl.so.14 \
libppl14 \
libstdc++.so.6"

inherit rpm
