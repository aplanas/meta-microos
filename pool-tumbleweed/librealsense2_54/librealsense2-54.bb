SUMMARY = "Library for Intel RealSense depth cameras"
DESCRIPTION = "Library for Intel RealSense depth cameras applications."
LICENSE = "Apache-2.0"

PV = "2.54.1"

RPM_NAME = "librealsense2_54-2.54.1-1.1.aarch64.rpm"
RPM_HASH = "4f850e56f6f12ed1398f1c37b2d2ca6a10e2976f77b751cf984a31dbe9402fa32dba0d0232389b6a9cb2f83f9cee8879ac04abeeed818ced3c307267b07ded37"

RPROVIDES:${PN} += "librealsense2-54 \
librealsense2-gl.so.2.54 \
librealsense2.so.2.54"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
