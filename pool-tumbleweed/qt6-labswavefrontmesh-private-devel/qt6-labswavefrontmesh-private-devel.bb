SUMMARY = "Non-ABI stable API for the Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "This package provides private headers of libQt6LabsWavefrontMesh that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labswavefrontmesh-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "fccf737e1c77c168aefa5e0c3ffff5bb9f18d6645b4f5838402a7ac7ff687d1dc3c1faccd1586a66bac7a3b3c669d9c4a1f39927a287406d62fb9ca339027e20"

RPROVIDES:${PN} += "qt6-labswavefrontmesh-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsWavefrontMesh"

inherit rpm
