SUMMARY = "Singular's Singular library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libSingular-4_3_1-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "a247bb8497c422e72f7bd7c63e4c0b746c5264ece7fc53314c009ceb27d531a2c7276d0b224d0f0c569b950b9d3d49e7b6314233aebb9f20d2d6b58d8bdcf935"

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
