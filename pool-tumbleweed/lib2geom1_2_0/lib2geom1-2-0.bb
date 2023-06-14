SUMMARY = "Easy to use 2D geometry library in C++"
DESCRIPTION = "A C++ 2D geometry library geared towards processing data \
associated with vector graphics. The primary design consideration \
is ease of use and clarity."
LICENSE = "LGPL-2.1-only & MPL-1.1"

PV = "1.2.2"

RPM_NAME = "lib2geom1_2_0-1.2.2-2.3.aarch64.rpm"
RPM_HASH = "b810f509820fdd64c5b8dd49c1ca55de1a0616cd42995fed607be83fad6c48b374b298a3d46a58cbf0734d0f32f8d75da88dfd389f64ff44ea0f84eadf7ea993"

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
