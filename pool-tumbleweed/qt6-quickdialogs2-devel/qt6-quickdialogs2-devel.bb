SUMMARY = "Qt6 QuickDialogs2 library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "28f5074550c5504d91268910658d3e0def61a95237e6097d20420993c322f121b3cf2a4f577fec9dea5616d88ef16d3d25b1876b12a1ae0de12c97fb93ab22c5"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2 \
pkgconfig-Qt6QuickDialogs2 \
qt6-quickdialogs2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6QuickDialogs2-6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-qml-private-devel \
qt6-quickcontrols2impl-devel \
qt6-quickdialogs2quickimpl-private-devel \
qt6-quickdialogs2utils-private-devel"

inherit rpm
