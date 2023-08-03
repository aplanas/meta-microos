SUMMARY = "Qt 6 QuickTest library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTest library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quicktest-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0a0e2b9debc0645b59301e8dea4b937cd3cecdf7fa3d780f15f832d113e0307e22c01ca90331db2ba7be20a28918bc46a5abcd414c90910b4219e7432fe9fbc8"

RPROVIDES:${PN} += "cmake-Qt6QuickTest \
pkgconfig-Qt6QuickTest \
qt6-quicktest-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Test \
libQt6QuickTest6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Test"

inherit rpm
