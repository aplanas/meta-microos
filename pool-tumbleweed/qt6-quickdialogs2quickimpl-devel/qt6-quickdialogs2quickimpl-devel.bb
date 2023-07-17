SUMMARY = "Qt6 QuickDialogs2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Impl library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2quickimpl-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "257baa47c65a327c6131921a85e32fd026914160483973f263b5aac942a42ccff99d9e2800e5893459513c8ede712b418dcc0957148052639fd4230a21b00756"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2QuickImpl \
pkgconfig-Qt6QuickDialogs2QuickImpl \
qt6-quickdialogs2quickimpl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickDialogs2Utils \
cmake-Qt6QuickTemplates2 \
libQt6QuickDialogs2QuickImpl6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick"

inherit rpm
