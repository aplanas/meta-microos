SUMMARY = "Qt 6 QuickLayouts library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickLayouts library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quicklayouts-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "cfa07b9df4d8546bf58720d450a6c96dc7b573619dea44c57d6a871052e49fb8a84b9cfe355d7475593bbf42c75e00d83adde7f41f6a8c0ba980c5e92cbfb43e"

RPROVIDES:${PN} += "cmake-Qt6QuickLayouts \
pkgconfig-Qt6QuickLayouts \
qt6-quicklayouts-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6QuickLayouts6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
