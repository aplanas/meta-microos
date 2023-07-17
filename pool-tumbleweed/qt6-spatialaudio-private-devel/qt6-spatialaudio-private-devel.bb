SUMMARY = "Non-ABI stable API for the Qt 6 SpatialAudio Library"
DESCRIPTION = "This package provides private headers of libQt6SpatialAudio that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-spatialaudio-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "06de86c6869d31fd38d774ac486484e8332a9bc2afc20ce94cdc9250168c27d0ffd48c05a2f18fb6c22ad4ab755d7d88736c1e352b9706294de18dd5815e9a6b"

RPROVIDES:${PN} += "qt6-spatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SpatialAudio"

inherit rpm
