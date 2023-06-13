SUMMARY = "Library for Intel RealSense depth cameras"
DESCRIPTION = "The SDK allows depth and color streaming, and provides intrinsic and extrinsic \
calibration information. The library also offers synthetic streams (pointcloud, \
depth aligned to color and vise-versa), and a built-in support for record and \
playback of streaming sessions."
LICENSE = "Apache-2.0"

PV = "2.53.1"

RPM_NAME = "librealsense-2.53.1-2.1.aarch64.rpm"
RPM_HASH = "1a8b371e737863ad3d3413b992c12441d50330d571a1b2f653673e74456f2fde47d5a13e0d5e3946f65b81a4580943a731b9d6919250748b1106dbc2838147b7"

RPROVIDES:${PN} += "librealsense \
librealsense(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGLU.so.1()(64bit) \
libOpenGL.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglfw.so.3()(64bit) \
libm.so.6()(64bit) \
librealsense2-gl.so.2.53()(64bit) \
librealsense2.so.2.53()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
