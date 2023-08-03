SUMMARY = "Qt 6 SerialPort library - Development files"
DESCRIPTION = "Development files for the Qt 6 SerialPort library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-serialport-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "16e9f827a6a7ef81910f9d0dc32dc438c8d2fb55a215ae3fa15bde140fcb4332660cb0fdfb447d30bb6b4d6dc37e750deb06b21ffb7745188fe39325acc5e6e5"

RPROVIDES:${PN} += "cmake-Qt6SerialPort \
pkgconfig-Qt6SerialPort \
qt6-serialport-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6SerialPort6 \
pkgconfig-Qt6Core"

inherit rpm
