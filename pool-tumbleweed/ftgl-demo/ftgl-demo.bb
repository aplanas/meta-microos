SUMMARY = "Demos for FTGL OpenGL font managing library"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes. \
 \
This package provides demo application showing usage of the library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "ftgl-demo-2.4.0-1.14.aarch64.rpm"
RPM_HASH = "f4c03aabc42f427e80183fbb8b9f2d2f0e9d4a099e1eed18b38c87bd218f89b024cb417dee1c0f8d55c18b7b36098fb27be5ea5af2d9df2998eb6cf8805c6e66"

RPROVIDES:${PN} += "ftgl-demo \
ftgl-demo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libc.so.6()(64bit) \
libftgl.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libglut.so.3()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
