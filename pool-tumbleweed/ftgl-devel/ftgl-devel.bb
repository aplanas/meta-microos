SUMMARY = "Development files for the FTGL OpenGL font managing library"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes. \
 \
This package provides development files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "ftgl-devel-2.4.0-1.14.aarch64.rpm"
RPM_HASH = "51f66e3e0b6e51a7d1ca87eb52b1a73ef04a33852ceb5d5ea1e7c51efa7b2ba6a2c72ff80b3bc74f80dce9c37640389857d2c018cbf56581010b73bd0b86e6a4"

RPROVIDES:${PN} += "ftgl-devel \
pkgconfig-ftgl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftgl2 \
pkgconfig-freetype2"

inherit rpm
