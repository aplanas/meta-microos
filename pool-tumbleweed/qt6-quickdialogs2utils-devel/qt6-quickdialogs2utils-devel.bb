SUMMARY = "Qt6 QuickDialogs2Utils library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Utils library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2utils-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0cbce1edf5f9d5b4d952e18026b43932c315d9ef7b2cda7fc587eb4bd1f3e362fbbc26733d54b0fae47d072ffe6e58e91d90f7bd5b9c1ed3e01dd5f86c9c5d29"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2Utils \
pkgconfig-Qt6QuickDialogs2Utils \
qt6-quickdialogs2utils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
libQt6QuickDialogs2Utils6 \
pkgconfig-Qt6Core"

inherit rpm
