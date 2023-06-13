SUMMARY = "Headers and library for librealsense"
DESCRIPTION = "Headers and cmake project files for developing librealsense applications."
LICENSE = "Apache-2.0"

PV = "2.53.1"

RPM_NAME = "librealsense-devel-2.53.1-2.1.aarch64.rpm"
RPM_HASH = "1317d27cc00881573f2f2477c98cb486229da49573ea24f4e728549c184878cef65f5ca3d8e56fa8d70b706c28660a5eb749d1b89af7c87c1444d3189ccf75a7"

RPROVIDES:${PN} += "cmake(realsense2) \
cmake(realsense2-gl) \
librealsense-devel \
librealsense-devel(aarch-64) \
pkgconfig(realsense2) \
pkgconfig(realsense2-gl)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librealsense2_53 \
pkgconfig(realsense2)"

inherit rpm
