SUMMARY = "Qt 6 QuickLayouts library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickLayouts library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicklayouts-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "aadd54b3b98b1c0fe9a644f80abdc799661a8da1744143384619757d876e724886c054d0ee21fe53e35e9c98235f92ba834621751483e508d8fc894a3d518173"

RPROVIDES:${PN} += "cmake-Qt6QuickLayouts \
pkgconfig-Qt6QuickLayouts \
qt6-quicklayouts-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt6QuickLayouts6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
