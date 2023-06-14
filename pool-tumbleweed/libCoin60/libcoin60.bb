SUMMARY = "Scene-graph based retain-mode 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97."
LICENSE = "GPL-2.0-only"

PV = "3.1.3"

RPM_NAME = "libCoin60-3.1.3-6.11.aarch64.rpm"
RPM_HASH = "7925ac93f7100ef5d1dffa5c36c19f8924f56de5179c8c0992c35c51b336b5264f140e9a3502d81a1ed7dbb9fc48233d6968359abd2110efdfeebf2c573435fc"

RPROVIDES:${PN} += "Coin \
libCoin.so.60 \
libCoin60"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libbz2.so.1 \
libc.so.6 \
libexpat.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
