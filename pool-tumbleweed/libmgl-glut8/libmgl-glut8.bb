SUMMARY = "MathGL window library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-glut8-8.0.1-4.2.aarch64.rpm"
RPM_HASH = "eb7549b2be55a9c26476447f8158194180dd42435b562a349170f1cce6cbdadb92a0adbb13e42ce0b48c89d16ef3ded4dd59f7daada7782eece36b220d0d0260"

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
