SUMMARY = "Qt 6 QuickControls2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickControls2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickcontrols2-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "51064c66b3c4ed0f83cff9c9f562f2c39054386fc05541f662f700e57e242fb65fe54421a6dffa4b824fa8d3747f3a4e1e55534d4e707ade8c8d468e2df7f0f8"

RPROVIDES:${PN} += "cmake-Qt6QuickControls2 \
pkgconfig-Qt6QuickControls2 \
qt6-quickcontrols2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Quick \
libQt6QuickControls2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-qml-private-devel \
qt6-quicktemplates2-private-devel"

inherit rpm
