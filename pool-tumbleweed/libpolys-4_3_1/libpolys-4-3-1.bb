SUMMARY = "Singular's POLYS library"
DESCRIPTION = "Data structures and basic algorithms for polynomials \
in Singular"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libpolys-4_3_1-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "943cdbb5241dff9be9f86e20dd6d6a53dc1e6e312ec95668f641a22e4693eb74e6878d628dbe7a5aa6f67405fe38d789f5f6e1b0ed253e57fb664eb85cf10727"

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
