SUMMARY = "Scene-graph based retain-mode 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "libCoin80-4.0.0-1.8.aarch64.rpm"
RPM_HASH = "53830b448f6edd6201fea7e073eb1623fd56c6d14685eb3894e559fb1b1bcfe313b61a4179ba7034f2c76524b1f3da350f6bb0b97ed7c63d5af9f14a86487757"

RPROVIDES:${PN} += "libCoin.so.80 \
libCoin80"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenGL.so.0 \
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
