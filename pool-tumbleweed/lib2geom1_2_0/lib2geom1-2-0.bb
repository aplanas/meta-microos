SUMMARY = "Easy to use 2D geometry library in C++"
DESCRIPTION = "A C++ 2D geometry library geared towards processing data \
associated with vector graphics. The primary design consideration \
is ease of use and clarity."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.2.2"

RPM_NAME = "lib2geom1_2_0-1.2.2-2.4.aarch64.rpm"
RPM_HASH = "4e83a4dbff1df7a5a695ce5e1296d694933a1033cedc013dd37be23ee80d3241a02e1fb6c5a1f4a63da988bb389d0c67478ab0f7d30c9719f07f771795e5e270"

RPROVIDES:${PN} += "lib2geom.so.1.2.0 \
lib2geom1-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdouble-conversion.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
