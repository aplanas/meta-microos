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

RPM_NAME = "Coin-devel-3.1.3-6.11.aarch64.rpm"
RPM_HASH = "b5023f8809b1ddd8f3edc8be564dc0e3eb6a6ec62b444de7ff6020f29765ace3af8b927c64d170ddb3de71004bee13495cf2e8135ee5c1b03c4228899ca9f9cd"

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
