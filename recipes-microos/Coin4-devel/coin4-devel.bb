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

RPM_NAME = "Coin4-devel-4.0.0-1.7.aarch64.rpm"
RPM_HASH = "34b4def2802ed4eb6aeae724f3148ce99e3b14c9bd89da2b48f6a1774acdaabe06f54713ea850ca79d71b80505188e626a2ebd3ef4876ec29c73956e16d30d33"

RPROVIDES:${PN} += "Coin4-devel Coin4-devel(aarch-64) cmake(coin) pkgconfig(Coin)"
RDEPENDS:${PN} += "/usr/bin/pkg-config fontconfig-devel freetype2-devel libCoin80 openal-soft-devel pkgconfig(bzip2) pkgconfig(dri) pkgconfig(gl) pkgconfig(glu) pkgconfig(x11) zlib-devel"

inherit rpm
