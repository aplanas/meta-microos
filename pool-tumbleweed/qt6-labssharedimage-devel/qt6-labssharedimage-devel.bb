SUMMARY = "Qt 6 LabsSharedImage library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSharedImage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssharedimage-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "0b29145a182e4189be96717f30dfc6777a5e5569381a08f24e071e8bf2d91b1322462126439511cf4a55ec0cd537cb85f93ed969e105f6b56a203eeb9c37ad35"

RPROVIDES:${PN} += "cmake-Qt6LabsSharedImage \
pkgconfig-Qt6LabsSharedImage \
qt6-labssharedimage-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsSharedImage6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
