SUMMARY = "OpenGL 2.0 and ES 2.0 benchmark"
DESCRIPTION = "A benchmark for OpenGL (ES) 2.0 that uses only the OpenGL ES 2.0 compatible \
API. It contains tests for standard OpenGL (ES) 2.0 features, such as vertex \
arrays, VBOs, texturing and shaders."
LICENSE = "GPL-3.0-only"

PV = "20230104"

RPM_NAME = "glmark2-20230104-1.3.aarch64.rpm"
RPM_HASH = "7c933bb1be03d4d6bdca638d0c8f4082e35ef68a96448d6a3565067612f5afc83948fe908143bdc6885767a563bc8833c11e3d97c61aa2c77d39a724f71bb14a"

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
