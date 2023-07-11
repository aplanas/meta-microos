SUMMARY = "Scene-graph based retain-mode 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97."
LICENSE = "GPL-2.0-only"

PV = "3.1.3"

RPM_NAME = "libCoin60-3.1.3-6.12.aarch64.rpm"
RPM_HASH = "295359b44e3d7b5555adc320709c23a932af151f5762d496383e4a77f8c6f8f90267dbc4a79b98e1d489e94fa15a81a36547707aeb579ba8bdb43d1eec641538"

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
