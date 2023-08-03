SUMMARY = "Qt 6 QuickWidgets library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickWidgets library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickwidgets-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "113a84628d81cb144a66073f23b4548bcc4262df1e4028d8c53cd889161372e0d1a144d6959a29f23510809b35692a1a3fce1d12c6d680e434b18e731d787ac2"

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
