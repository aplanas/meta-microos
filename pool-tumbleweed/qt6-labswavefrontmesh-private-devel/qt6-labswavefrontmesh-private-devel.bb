SUMMARY = "Non-ABI stable API for the Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "This package provides private headers of libQt6LabsWavefrontMesh that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labswavefrontmesh-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e827528df90b7707ef1eb725a36f518d8db74d1a39837287e584ea42b3b6aecacfca020300ef08df38c4bc7964e9b2fcb10c006f911c3f31c110162c6a7573ab"

RPROVIDES:${PN} += "qt6-labswavefrontmesh-private-devel \
qt6-labswavefrontmesh-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsWavefrontMesh)"

inherit rpm
