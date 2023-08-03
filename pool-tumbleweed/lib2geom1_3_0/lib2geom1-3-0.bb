SUMMARY = "Easy to use 2D geometry library in C++"
DESCRIPTION = "A C++ 2D geometry library geared towards processing data \
associated with vector graphics. The primary design consideration \
is ease of use and clarity."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.3.0"

RPM_NAME = "lib2geom1_3_0-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "ac6f9e32df5fad25a823a61340a9935a65b8f92ecd4084688026c7e28673c0b56027b5809cb69eca6ebbc715a8b23d3ae929d4ec718841570d10b17a1ab596f1"

RPROVIDES:${PN} += "lib2geom.so.1.3.0 \
lib2geom1-3-0"

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
