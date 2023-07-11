SUMMARY = "Development files for Coin, a 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of Coin."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "Coin4-devel-4.0.0-1.8.aarch64.rpm"
RPM_HASH = "f1641098b6d6cb1dacb2e955b763b24f44d0e262cd7a5d93c47ae82883a7b940f48105ae5f0f2d46d0b8ceb6ec63eac12012a698aa8e8661d948eeab87b6aaf1"

RPROVIDES:${PN} += "Coin4-devel \
cmake-coin \
pkgconfig-Coin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fontconfig-devel \
freetype2-devel \
libCoin80 \
openal-soft-devel \
pkgconfig-bzip2 \
pkgconfig-dri \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-x11 \
zlib-devel"

inherit rpm
