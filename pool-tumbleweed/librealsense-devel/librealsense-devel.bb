SUMMARY = "Headers and library for librealsense"
DESCRIPTION = "Headers and cmake project files for developing librealsense applications."
LICENSE = "Apache-2.0"

PV = "2.54.1"

RPM_NAME = "librealsense-devel-2.54.1-1.1.aarch64.rpm"
RPM_HASH = "0de2cd08543b8552a4136c8465fe4a3d864f94c8471885b8e4ae196f9135e49e8e9415aad7059d22baaae3d14b194527e6514611c97f20b1a3dd54f964169652"

RPROVIDES:${PN} += "cmake-realsense2 \
cmake-realsense2-gl \
librealsense-devel \
pkgconfig-realsense2 \
pkgconfig-realsense2-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librealsense2-54 \
pkgconfig-realsense2"

inherit rpm
