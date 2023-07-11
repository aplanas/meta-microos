SUMMARY = "Qt 6 LabsAnimation library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labsanimation-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "982c783c0e8fb8e2b87ec25765c35180b2655b7bd84755c9c155c68869f7b5bfde058f07de7f970490708f0db6fc32f2b7dabf08b6325b42951d1e6d8dde8fbd"

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
