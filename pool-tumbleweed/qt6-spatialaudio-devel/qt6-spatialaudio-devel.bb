SUMMARY = "Qt 6 SpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-spatialaudio-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "a2badc7423d8ab61c30068cc4b9a326af3d36e0df783136557ccd6cd4b1afd840f81cb1668bf86f9ef0322726c1150d66e11d5a97f9ee1b429fb05faee5021ba"

RPROVIDES:${PN} += "cmake-Qt6SpatialAudio \
pkgconfig-Qt6SpatialAudio \
qt6-spatialaudio-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt6SpatialAudio6 \
pkgconfig-Qt6Multimedia"

inherit rpm
