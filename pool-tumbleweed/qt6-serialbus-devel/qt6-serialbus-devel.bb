SUMMARY = "Qt 6 SerialBus library - Development files"
DESCRIPTION = "Development files for the Qt 6 SerialBus library."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b372837ff85dc3a2140dfcefd43fb187d39e255a47a474e2c8c05308be98149df7e7116493248d1d6f386b159c1b4514ff074fff9aaa78720b0f68e492f7684e"

RPROVIDES:${PN} += "cmake-Qt6SerialBus \
pkgconfig-Qt6SerialBus \
qt6-serialbus-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
cmake-Qt6SerialPort \
libQt6SerialBus6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6SerialPort \
qt6-serialbus"

inherit rpm
