SUMMARY = "Qt 6 SpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-spatialaudio-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "71ee0ecf0c703edd71b08a012f720914578f5cd112e0073da9cfe4c4759d1653fb903695b3c9e2a7d372d3f747a192e27d85cd6077da1af98fd5eea9650413a7"

RPROVIDES:${PN} += "cmake-Qt6SpatialAudio \
pkgconfig-Qt6SpatialAudio \
qt6-spatialaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Multimedia \
libQt6SpatialAudio6 \
pkgconfig-Qt6Multimedia"

inherit rpm
