SUMMARY = "OpenGL to PostScript Printing Library"
DESCRIPTION = "GL2PS is a C library providing vector output for any OpenGL \
application. It uses sorting algorithms capable of handling \
intersecting and stretched polygons, as well as non-manifold objects. \
GL2PS provides smooth shading and text rendering, culling of \
invisible primitives and mixed vector/bitmap output."
LICENSE = "LGPL-2.0-or-later | SUSE-GL2PS-2.0"

PV = "1.4.2"

RPM_NAME = "libgl2ps1-1.4.2-1.13.aarch64.rpm"
RPM_HASH = "1ac491f6e4d923de3c1ad8f14705f3ff7c4a9eb6300af520455379afc601dbc6494c28e7f80a1a5819d0dbef1a0a00d7d121a729aceebda4a369dd227ae25c73"

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
