SUMMARY = "Qt 6 OpcUa library - Development files"
DESCRIPTION = "Development files for the Qt 6 OpcUa library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-opcua-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "088a09f068d000f14b4300e5ed2537cdb1620d86b0c4b9867fcbf88cb612a62fafdfb006337b389fb709b74fb2d9e5d9edadf594c5f547cf0f17baca6201b5f8"

RPROVIDES:${PN} += "cmake-Qt6OpcUa \
cmake-Qt6QOpen62541Plugin \
pkgconfig-Qt6OpcUa \
qt6-opcua-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6OpcUa6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
