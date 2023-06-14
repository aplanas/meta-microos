SUMMARY = "Examples for librealsense"
DESCRIPTION = "Examples from the librealsense library."
LICENSE = "Apache-2.0"

PV = "2.53.1"

RPM_NAME = "librealsense-examples-2.53.1-2.1.aarch64.rpm"
RPM_HASH = "d43846018015f2144dd8b830608a5466e4e2bf2d442519763321821d35730b54fc684d5ebfde70cbadad8aa60a59458b046116cf37b2849d675c7b5de4001851"

RPROVIDES:${PN} += "librealsense-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
librealsense \
librealsense2-gl.so.2.53 \
librealsense2.so.2.53 \
libstdc++.so.6"

inherit rpm
