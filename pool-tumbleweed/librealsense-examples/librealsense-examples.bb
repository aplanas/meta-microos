SUMMARY = "Examples for librealsense"
DESCRIPTION = "Examples from the librealsense library."
LICENSE = "Apache-2.0"

PV = "2.53.1"

RPM_NAME = "librealsense-examples-2.53.1-2.1.aarch64.rpm"
RPM_HASH = "d43846018015f2144dd8b830608a5466e4e2bf2d442519763321821d35730b54fc684d5ebfde70cbadad8aa60a59458b046116cf37b2849d675c7b5de4001851"

RPROVIDES:${PN} += "librealsense-examples \
librealsense-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLU.so.1()(64bit) \
libOpenGL.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglfw.so.3()(64bit) \
libm.so.6()(64bit) \
librealsense \
librealsense2-gl.so.2.53()(64bit) \
librealsense2.so.2.53()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
