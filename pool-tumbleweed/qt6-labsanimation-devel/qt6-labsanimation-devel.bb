SUMMARY = "Qt 6 LabsAnimation library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsAnimation library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labsanimation-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "77e514e7d6ce2f33edcfbbf3c3564a58c01483aed2dc9c55855882dbc53f263232d5d25966804c2ac22dabc1814cd6fd236442d01ee15073b7438958dc987ffc"

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
