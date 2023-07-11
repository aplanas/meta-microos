SUMMARY = "Qt 6 ScxmlQml library - Development files"
DESCRIPTION = "Development files for the Qt 6 ScxmlQml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxmlqml-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "4c78b011b32e83d3534cc3a015c955e9a0e1c99d1c5f9bd86e76d410c6190d6755f2052c1f27c65ce2ba2d47de54788ebcbadf92aab649b614a6d2aad8c1f6b2"

RPROVIDES:${PN} += "cmake-Qt6ScxmlQml \
pkgconfig-Qt6ScxmlQml \
qt6-scxmlqml-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Scxml \
libQt6ScxmlQml6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Scxml"

inherit rpm
