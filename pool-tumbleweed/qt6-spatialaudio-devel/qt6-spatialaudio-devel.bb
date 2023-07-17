SUMMARY = "Qt 6 SpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-spatialaudio-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fd2bfcf25d59fbd5910f0dbac775a9659c7544545c1968474a5fe74ce7ca26059d13d038c49645e4fb5039f7ae3d8ad041ac18ebe930e3920553726fe05eab5d"

RPROVIDES:${PN} += "cmake-Qt6SpatialAudio \
pkgconfig-Qt6SpatialAudio \
qt6-spatialaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Multimedia \
libQt6SpatialAudio6 \
pkgconfig-Qt6Multimedia"

inherit rpm
