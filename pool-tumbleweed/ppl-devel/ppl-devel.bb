SUMMARY = "Development tools for the Parma Polyhedra Library C and C++ interfaces"
DESCRIPTION = "The header files, Autoconf macro, and ppl-config tool for developing \
applications using the Parma Polyhedra Library through its C and C++ \
interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "ppl-devel-1.2-3.2.aarch64.rpm"
RPM_HASH = "8a0bfd1160b89f31543485b2afac0da49ce1b65db88bc368b06ba4c4167a3f67155faed5f73e881fefd720dbccba4c018e47b77afd0bb093195ddb4dc9958694"

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
