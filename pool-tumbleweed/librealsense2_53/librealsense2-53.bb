SUMMARY = "Library for Intel RealSense depth cameras"
DESCRIPTION = "Library for Intel RealSense depth cameras applications."
LICENSE = "Apache-2.0"

PV = "2.53.1"

RPM_NAME = "librealsense2_53-2.53.1-2.2.aarch64.rpm"
RPM_HASH = "f9a00e14349ee701c979720eece4c778207a91d31d3e69678fa1b09d5737d0ad3fc1bbf34f926879109eb28e9fe82345f6d3ee5ddc35e2d438b9f70e03acd910"

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
