SUMMARY = "Library for Using Arbitrary Fonts in OpenGL Applications"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libftgl2-2.4.0-1.14.aarch64.rpm"
RPM_HASH = "d614e10f84b3adf9dc56158389781cdb3499b057772b80817de0b10c3642e5e6ce59bda5d930f1c80edaf367e5af1e83486ae12f6dd0bf39963a55b0e23a1641"

RPROVIDES:${PN} += "libftgl.so.2 \
libftgl2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
