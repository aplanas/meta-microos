SUMMARY = "Non-ABI stable API for the Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "This package provides private headers of libQt6LabsWavefrontMesh that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-labswavefrontmesh-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "a5cae325021e8cd28243e4bea8057a07d2614914f82968a960d1de6ecc043d9a206ddfc2da97eec9d9608486655b7500d927838c5584a1011705bbe72c255649"

RPROVIDES:${PN} += "qt6-labswavefrontmesh-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsWavefrontMesh"

inherit rpm
