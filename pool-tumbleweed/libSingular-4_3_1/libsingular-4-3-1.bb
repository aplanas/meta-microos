SUMMARY = "Singular's Singular library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libSingular-4_3_1-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "43e68cd2c7a6251e4caa2310b47118e4a1c0d675ca62966b491b43302d0b13172b8574c81c1e0ad96837362b274a65e4c7f8520e07020989bf628ad329326952"

RPROVIDES:${PN} += "libSingular-4-3-1 \
libSingular-4.3.1.p3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfactory-4.3.1.p3.so \
libflint.so.17 \
libgmp.so.10 \
libm.so.6 \
libomalloc-4.3.1.p3.so \
libpolys-4.3.1.p3.so \
libreadline.so.8 \
libsingular-resources-4.3.1.p3.so \
libstdc++.so.6"

inherit rpm
