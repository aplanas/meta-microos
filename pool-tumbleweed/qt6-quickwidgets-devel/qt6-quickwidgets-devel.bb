SUMMARY = "Qt 6 QuickWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickwidgets-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "615258a3d1956f11ace7432eb482916962938c2300947e995d21fabd535c07ad0a015abc077e645f8a8c35f0068ed510a32faa30144a178b4cb54ad5590191e1"

RPROVIDES:${PN} += "cmake-Qt6QuickWidgets \
pkgconfig-Qt6QuickWidgets \
qt6-quickwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Widgets \
libQt6QuickWidgets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Widgets"

inherit rpm
