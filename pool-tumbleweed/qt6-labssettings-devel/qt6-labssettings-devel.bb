SUMMARY = "Qt 6 LabsSettings library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSettings library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssettings-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "2923aa8c4a1bdc7d686c5fd6752b252f9cf44669b0b8ccce1cb487dbb7c38c70181b38c8f4b38fc8d9ec4312ebce1c4d5699cae8b39d31667e3f34cd438d5777"

RPROVIDES:${PN} += "cmake-Qt6LabsSettings \
pkgconfig-Qt6LabsSettings \
qt6-labssettings-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Qml \
libQt6LabsSettings6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
