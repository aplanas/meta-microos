SUMMARY = "Qt 6 WebSockets library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebSockets library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-websockets-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "524fc42cec07d03e152f8b073ad9728d26f176fb2fcfdc23a928742e412f5efa2bc0b343fabf06cf41e7ca05fcceb590c9f3447e44362580861b76ebaaaf4842"

RPROVIDES:${PN} += "cmake-Qt6WebSockets \
pkgconfig-Qt6WebSockets \
qt6-websockets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6WebSockets6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
