SUMMARY = "Qt 6 LabsWavefrontMesh library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsWavefrontMesh library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labswavefrontmesh-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "a754d1e84eb2301e0a4827495855d34278c6f5c1d15dc46f8b35e2f49f816cd5996543f6a84c65cd1392d821e526340f0e1890e156beabef1fc1535d6ff1479c"

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
