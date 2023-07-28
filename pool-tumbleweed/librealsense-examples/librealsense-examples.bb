SUMMARY = "Examples for librealsense"
DESCRIPTION = "Examples from the librealsense library."
LICENSE = "Apache-2.0"

PV = "2.54.1"

RPM_NAME = "librealsense-examples-2.54.1-1.1.aarch64.rpm"
RPM_HASH = "fb6294320b4bf1aaa3dd21925211040e637881fa5c1214edcd22b7c72d60bdc2b053ab0bee1a0222b39d68ded15b51c6727189dbd44aeb6476d8f445881fb2a7"

RPROVIDES:${PN} += "librealsense-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
librealsense \
librealsense2-gl.so.2.54 \
librealsense2.so.2.54 \
libstdc++.so.6"

inherit rpm
