SUMMARY = "Qt 6 Multimedia library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimedia-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d36259f70c61cbcabbded760835d2cb452cd03abdf56fc4b204c9cad76f828d3b52cf55435003cbda7ff784aded9cdc15fd6bb2e881eb278b612a5a63b773191"

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
