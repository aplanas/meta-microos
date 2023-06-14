SUMMARY = "Development files for the Qt 5 Input 3D library"
DESCRIPTION = "Development files for the Qt 5 Input 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DInput-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "2a9bc6279931d9f990925eb1c65594c9b2cb18eeb0f4beffd4faa90b05ea3711d59baca18d04c17abe7cba1c65175342f5f0014c63e6dffa8b5dcc1adcfedb0e"

RPROVIDES:${PN} += "cmake-Qt53DInput \
libQt53DInput-devel \
pkgconfig-Qt53DInput"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DInput5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
