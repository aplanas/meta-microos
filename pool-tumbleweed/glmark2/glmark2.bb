SUMMARY = "OpenGL 2.0 and ES 2.0 benchmark"
DESCRIPTION = "A benchmark for OpenGL (ES) 2.0 that uses only the OpenGL ES 2.0 compatible \
API. It contains tests for standard OpenGL (ES) 2.0 features, such as vertex \
arrays, VBOs, texturing and shaders."
LICENSE = "GPL-3.0-only"

PV = "20230104"

RPM_NAME = "glmark2-20230104-1.4.aarch64.rpm"
RPM_HASH = "27962793e61812f8e88b879f0da9755bc469f4a3588bf9cf562aa90dc4f53dfcbc2dcfc0c4bf42d46b4f401b4b57a64f36b41afd3e1761adb5795735ebf4ab5f"

RPROVIDES:${PN} += "glmark2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1"

inherit rpm
