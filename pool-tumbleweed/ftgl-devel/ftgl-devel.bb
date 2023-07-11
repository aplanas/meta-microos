SUMMARY = "Development files for the FTGL OpenGL font managing library"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes. \
 \
This package provides development files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "ftgl-devel-2.4.0-1.15.aarch64.rpm"
RPM_HASH = "c51a1f4b9be184c55d01fb8f446982f7bcc3f2c4be29b74364cf5c0b576ed60f4f350df0b772c35e1f4ce4522329f274ddff142649fb1bbf038d4b02a9c191b1"

RPROVIDES:${PN} += "ftgl-devel \
pkgconfig-ftgl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftgl2 \
pkgconfig-freetype2"

inherit rpm
