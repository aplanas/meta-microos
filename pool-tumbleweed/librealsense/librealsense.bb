SUMMARY = "Library for Intel RealSense depth cameras"
DESCRIPTION = "The SDK allows depth and color streaming, and provides intrinsic and extrinsic \
calibration information. The library also offers synthetic streams (pointcloud, \
depth aligned to color and vise-versa), and a built-in support for record and \
playback of streaming sessions."
LICENSE = "Apache-2.0"

PV = "2.53.1"

RPM_NAME = "librealsense-2.53.1-2.2.aarch64.rpm"
RPM_HASH = "a832ae819c6c043d07fc06282a70de0017008db85af1287ecc72831af096a9605abee0ef1827d777dadc2f550c65b8c436a90c551e4925d1ea964ee821dbc1fa"

RPROVIDES:${PN} += "librealsense"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
librealsense2-gl.so.2.53 \
librealsense2.so.2.53 \
libstdc++.so.6"

inherit rpm
