SUMMARY = "Qt6 QuickDialogs2Impl library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Impl library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2quickimpl-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "757c2e8e6f8aa4405764e92721b2ea92953849d6597be06020468b23385dcdad38f6be5a5c937c1ce0d908ef76d2a4337f833b4c638cf7aaa5265094f2bfeafd"

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
