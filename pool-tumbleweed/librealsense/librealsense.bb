SUMMARY = "Library for Intel RealSense depth cameras"
DESCRIPTION = "The SDK allows depth and color streaming, and provides intrinsic and extrinsic \
calibration information. The library also offers synthetic streams (pointcloud, \
depth aligned to color and vise-versa), and a built-in support for record and \
playback of streaming sessions."
LICENSE = "Apache-2.0"

PV = "2.54.1"

RPM_NAME = "librealsense-2.54.1-1.1.aarch64.rpm"
RPM_HASH = "62af5cf7aed8a0e5a47375b867eff608c1f531f8ce27dfaf619ccc5a6515b15fc30db446f9c15d1adf535f30410d7d54e8d61e8f1e8bd0849c6ec5e55d69b496"

RPROVIDES:${PN} += "librealsense"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
librealsense2-gl.so.2.54 \
librealsense2.so.2.54 \
libstdc++.so.6"

inherit rpm
