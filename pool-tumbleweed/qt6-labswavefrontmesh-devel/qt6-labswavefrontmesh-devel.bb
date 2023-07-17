SUMMARY = "Qt 6 LabsWavefrontMesh library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labswavefrontmesh-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "bf194c83b14780ed47b4501ba33fc1cb339add8cdf7e7c84cb5a17d09f5e3ae59e1f7d806e77bdb9c6ea4d61701a239299cc5dbb5bbaadcfe67d6948e1cf4693"

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
