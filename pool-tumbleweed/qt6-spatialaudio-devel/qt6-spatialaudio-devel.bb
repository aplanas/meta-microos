SUMMARY = "Qt 6 SpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-spatialaudio-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "afd868331718a9cbd7afb43bb2d7559da3c362d6ac7f97264d33665ed487fc4fbcf98e827a418c131f527fc516dd8a11a7b5e0c9ea080deb3a6acfaa891053ae"

RPROVIDES:${PN} += "cmake-Qt6SpatialAudio \
pkgconfig-Qt6SpatialAudio \
qt6-spatialaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt6SpatialAudio6 \
pkgconfig-Qt6Multimedia"

inherit rpm
