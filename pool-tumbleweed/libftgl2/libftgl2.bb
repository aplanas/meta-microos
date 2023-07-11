SUMMARY = "Library for Using Arbitrary Fonts in OpenGL Applications"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libftgl2-2.4.0-1.15.aarch64.rpm"
RPM_HASH = "d5e9d7a25b3ce7880a270ca6476dbb3eee5018ce3ca69750048b15c3d286e24e72956c32961eb80f0861df4d2d5a396645c37b1b6a9d28d20a65466ddcbd0933"

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
