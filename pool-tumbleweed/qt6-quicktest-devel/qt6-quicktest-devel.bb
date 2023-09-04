SUMMARY = "Qt 6 QuickTest library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTest library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quicktest-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "ac6aa3e12cfcaca07595e40eca89cd7b113e378cfc67919c774551d6f77a815be6584009e113cd2395cb3337d3a12653b23a6ae44c0dbd6f1dcd9c7d3181f6d1"

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
