SUMMARY = "MathGL window library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-glut8-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "03208d8b1d2ac9bfe850064cbbe2700978e4ac51965b82f84665ea3e4a16b9aa1e449b2e5d11cc5f361cf446462ca88946fef4cce0f423a74cf526e5f5537598"

RPROVIDES:${PN} += "libmgl-glut.so.8 \
libmgl-glut8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglut.so.3 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
