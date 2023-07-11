SUMMARY = "Headers and library for librealsense"
DESCRIPTION = "Headers and cmake project files for developing librealsense applications."
LICENSE = "Apache-2.0"

PV = "2.53.1"

RPM_NAME = "librealsense-devel-2.53.1-2.2.aarch64.rpm"
RPM_HASH = "fa70ee28e69dcb4d74dfc3d76f45157086d028907e8aaa1f05539f3f78bcb966acd89ec36484c6de4e0b8621352c74e98e9ac921af0970a162503c7946598016"

RPROVIDES:${PN} += "cmake-realsense2 \
cmake-realsense2-gl \
librealsense-devel \
pkgconfig-realsense2 \
pkgconfig-realsense2-gl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librealsense2-53 \
pkgconfig-realsense2"

inherit rpm
