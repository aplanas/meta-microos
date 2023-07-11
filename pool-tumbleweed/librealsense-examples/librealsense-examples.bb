SUMMARY = "Examples for librealsense"
DESCRIPTION = "Examples from the librealsense library."
LICENSE = "Apache-2.0"

PV = "2.53.1"

RPM_NAME = "librealsense-examples-2.53.1-2.2.aarch64.rpm"
RPM_HASH = "5e4ee29961cc409878d3fc5c8178834a05ff71b3ef06f07ccac2b1e005d3c3b011b218dfdc394ac4c3b288e5f98742195d105247887b056b4494999fc174b07d"

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
