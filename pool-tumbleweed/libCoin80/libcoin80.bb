SUMMARY = "Scene-graph based retain-mode 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97."
LICENSE = "BSD-3-Clause"

PV = "4.0.0"

RPM_NAME = "libCoin80-4.0.0-1.7.aarch64.rpm"
RPM_HASH = "0f6a41a433862495cf6bf3012224278856d6cdd7937ae7244f1f5f538fd5308cdca7ef5f48f98facd2de0ef2dbf67f771f890b0633a651c4bf7f5b242b37abcd"

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
