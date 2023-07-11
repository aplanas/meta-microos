SUMMARY = "Singular's POLYS library"
DESCRIPTION = "Data structures and basic algorithms for polynomials \
in Singular"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libpolys-4_3_1-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "20859e26c6228abf69cc2ef963512cffdc4d4639d3907a3936907810098f4a04ba06facb3933124c7c82f60f7ca02b41ceffcdeeb3d510b81aa899c2b3d2091a"

RPROVIDES:${PN} += "libpolys-4-3-1 \
libpolys-4.3.1.p3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfactory-4.3.1.p3.so \
libflint.so.17 \
libgmp.so.10 \
libm.so.6 \
libntl.so.44 \
libomalloc-4.3.1.p3.so \
libsingular-resources-4.3.1.p3.so \
libstdc++.so.6"

inherit rpm
