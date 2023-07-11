SUMMARY = "Demos for FTGL OpenGL font managing library"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes. \
 \
This package provides demo application showing usage of the library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "ftgl-demo-2.4.0-1.15.aarch64.rpm"
RPM_HASH = "83f9dc298b827fdfd318ed9e6b5e0e5260a29333ee829a1742eaeeebb7ae2d43bb3eaec60fe36c22beb43f49571e2d677c1fe95e4fa418568969e32881ab2cbf"

RPROVIDES:${PN} += "ftgl-demo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libftgl.so.2 \
libgcc-s.so.1 \
libglut.so.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
