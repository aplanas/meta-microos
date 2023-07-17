SUMMARY = "Non-ABI stable API for the Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "This package provides private headers of libQt6LabsWavefrontMesh that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labswavefrontmesh-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "842e89fc2a90f954b2cebfe6c2e424a9627e9e781315d5a3709ed8b895216d16fdd72fc33b47143c543f22812a0ed894f1eceb09be3f6350d2d8c8443acd98e7"

RPROVIDES:${PN} += "qt6-labswavefrontmesh-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsWavefrontMesh"

inherit rpm
