SUMMARY = "Qt 6 LabsAnimation library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsanimation-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "458e038d38d1c3e10d7d330d02ffa3e3ed5bb03798e3e19199be2e48fc01a0613d5ac7f8c05840318fbcf0c0bdfd7aa2aef8b7c2803e4da7f1edf7e9e35269b2"

RPROVIDES:${PN} += "cmake-Qt6LabsAnimation \
pkgconfig-Qt6LabsAnimation \
qt6-labsanimation-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsAnimation6 \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
