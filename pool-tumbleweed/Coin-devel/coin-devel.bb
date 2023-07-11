SUMMARY = "Development files for Coin, a 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of Coin."
LICENSE = "GPL-2.0-only"

PV = "3.1.3"

RPM_NAME = "Coin-devel-3.1.3-6.12.aarch64.rpm"
RPM_HASH = "da74e9aadb6879aa9fa80a6f721f5bf943ae124941595f76652b38b6c1f4f3c2f93b58f3e13d3c0184f5150d904513756a8d1d0578fa3fe1e8e3e65bea2a1de8"

RPROVIDES:${PN} += "Coin-devel \
pkgconfig-Coin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
fontconfig-devel \
freetype2-devel \
libCoin60 \
openal-soft-devel \
pkgconfig-bzip2 \
pkgconfig-dri \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-ice \
pkgconfig-x11 \
pkgconfig-xt \
zlib-devel"

inherit rpm
