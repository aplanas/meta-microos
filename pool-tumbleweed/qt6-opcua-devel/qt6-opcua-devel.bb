SUMMARY = "Qt 6 OpcUa library - Development files"
DESCRIPTION = "Development files for the Qt 6 OpcUa library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0561fd59631cb19d398115dc09682ee263d8c62f392ce7e71cb7ef2062c774c1da45c533317333d5f9182e8de4d344e5067f5b0693a2f62cafa2245e3cfcfc63"

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
