SUMMARY = "Qt 6 LabsWavefrontMesh library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labswavefrontmesh-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "261880975480ea9dd8e4889a64e876e01ee75002af57936c7aa60d50b800d89a590a3c841685064d5912475ec2b42ac8018955619313283b7f96b32c63163161"

RPROVIDES:${PN} += "cmake-Qt6LabsWavefrontMesh \
pkgconfig-Qt6LabsWavefrontMesh \
qt6-labswavefrontmesh-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsWavefrontMesh6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
