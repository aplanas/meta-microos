SUMMARY = "Qt 6 LabsSettings library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSettings library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labssettings-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d3ec37b40f0db11d06a2a6f89fd3f8495a04d639cd83acd898c107f8a39de08245ecb85c01d21a292115c1a3df667a705ce5b6c0a043b7d40180bf6d2ae4b38b"

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
