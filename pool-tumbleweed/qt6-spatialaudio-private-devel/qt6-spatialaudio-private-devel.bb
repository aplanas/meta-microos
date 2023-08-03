SUMMARY = "Non-ABI stable API for the Qt 6 SpatialAudio Library"
DESCRIPTION = "This package provides private headers of libQt6SpatialAudio that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-spatialaudio-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3dc0a8856844b132909a026d0c2da3ebf744c4064bd9513ac34f7520567b45c9d2a092a8288435e84f1e737aa0252cb7402480c5d73bf718aacfdcf468cb2a8b"

RPROVIDES:${PN} += "qt6-spatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SpatialAudio"

inherit rpm
