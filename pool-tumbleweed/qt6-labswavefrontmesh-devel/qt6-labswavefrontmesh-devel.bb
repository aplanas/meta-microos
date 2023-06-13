SUMMARY = "Qt 6 LabsWavefrontMesh library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsWavefrontMesh library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labswavefrontmesh-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "04a42a67cdc680f222c269e4dec0f3969a38bbf0711f21c029b232959859449ca2855124c5f33965ee119fbce5ca10466378dbc06cfe6fbfcc9b0d4fd729a284"

RPROVIDES:${PN} += "cmake(Qt6LabsWavefrontMesh) \
pkgconfig(Qt6LabsWavefrontMesh) \
qt6-labswavefrontmesh-devel \
qt6-labswavefrontmesh-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsWavefrontMesh6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6Quick) \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
