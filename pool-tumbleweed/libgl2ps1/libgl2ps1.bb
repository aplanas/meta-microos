SUMMARY = "OpenGL to PostScript Printing Library"
DESCRIPTION = "GL2PS is a C library providing vector output for any OpenGL \
application. It uses sorting algorithms capable of handling \
intersecting and stretched polygons, as well as non-manifold objects. \
GL2PS provides smooth shading and text rendering, culling of \
invisible primitives and mixed vector/bitmap output."
LICENSE = "LGPL-2.0-or-later | SUSE-GL2PS-2.0"

PV = "1.4.2"

RPM_NAME = "libgl2ps1-1.4.2-1.12.aarch64.rpm"
RPM_HASH = "8de9d34cd877a492896231b076a2d10640d9ee24d7c5f08b71e6513c16b78ce62dda35017d9ea1a6a038a8a521050918efff615773284fc9843acce6022ce535"

RPROVIDES:${PN} += "libgl2ps.so.1 \
libgl2ps1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
