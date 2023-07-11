SUMMARY = "Qt 6 LabsWavefrontMesh library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labswavefrontmesh-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "dfce63d7f107c14d5e41274a151186df47ec7eb579c511f2903bf62327523eb8fa36a654d2762ecf4fd1b7127d4870438bbdc739273c825da2db8dad3fd6b4ba"

RPROVIDES:${PN} += "cmake-Qt6LabsWavefrontMesh \
pkgconfig-Qt6LabsWavefrontMesh \
qt6-labswavefrontmesh-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsWavefrontMesh6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
