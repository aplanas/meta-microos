SUMMARY = "Easy to use 2D geometry library in C++"
DESCRIPTION = "A C++ 2D geometry library geared towards processing data \
associated with vector graphics. The primary design consideration \
is ease of use and clarity."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.3.0"

RPM_NAME = "lib2geom1_3_0-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "125e3b4ce7c7c05099017b304186347570ba787e92ee4153fa41ed2d34ac6d0adcef5e1187b5a9f1b81f53f65500c8045609fc360af7b8f8c782875c661656e0"

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
