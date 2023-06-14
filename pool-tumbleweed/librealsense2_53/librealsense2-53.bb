SUMMARY = "Library for Intel RealSense depth cameras"
DESCRIPTION = "Library for Intel RealSense depth cameras applications."
LICENSE = "Apache-2.0"

PV = "2.53.1"

RPM_NAME = "librealsense2_53-2.53.1-2.1.aarch64.rpm"
RPM_HASH = "6e87f67a5e87d32da494b4a0ec6fd6715512a34a6c52f4628ed47e69be0c179d3cc0a9283a2caef144f29b7b84da1592158c79a0c135436a9f4e6ea6caf60089"

RPROVIDES:${PN} += "librealsense2-53 \
librealsense2-gl.so.2.53 \
librealsense2.so.2.53"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
