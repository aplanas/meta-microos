SUMMARY = "Qt 6 Core 5 Compat library - Development files"
DESCRIPTION = "Development files for the Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qt5compat-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e822908632c5b9c8a71466a06a3314a1147d44ba3173415fbb67ca019af2448c20aaf33a9161ff8f171171a8df3ac683f9e8d8e2c1bc70d978d072f19aa71371"

RPROVIDES:${PN} += "cmake-Qt6Core5Compat \
pkgconfig-Qt6Core5Compat \
qt6-qt5compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Core5Compat6 \
pkgconfig-Qt6Core"

inherit rpm
