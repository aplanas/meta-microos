SUMMARY = "Qt 6 Multimedia library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fa5bfe6f5595c0be44b31e988b228ed2fc6db36784f264b848a8e86929cceccf0c63992062cda089d6de8b6dceed635ddde1d6b4255b832d7c7fc68e33cffeb6"

RPROVIDES:${PN} += "cmake-Qt6Multimedia \
pkgconfig-Qt6Multimedia \
qt6-multimedia-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt6Multimedia6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Network"

inherit rpm
