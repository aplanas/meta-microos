SUMMARY = "Non-ABI stable API for the Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "This package provides private headers of libQt6LabsWavefrontMesh that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labswavefrontmesh-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "31dcedde642cd1449ee7de263e945dfb1612d942209d787d4f388b19661463836e8285363353956149190630b9c43fcdaa5a39c953600d15d12f8e8e17f4bf06"

RPROVIDES:${PN} += "qt6-labswavefrontmesh-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsWavefrontMesh"

inherit rpm
