SUMMARY = "Non-ABI stable API for the Qt 6 SpatialAudio Library"
DESCRIPTION = "This package provides private headers of libQt6SpatialAudio that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-spatialaudio-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "35a99cf426b350e475be537d9a6955b90e700fed2d5031bdc2f2b09812909a2b56bd5e7c29cbd980043589a0fd8833e1d7f5f54cc01c4a3d2f9942022c544433"

RPROVIDES:${PN} += "qt6-spatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SpatialAudio"

inherit rpm
