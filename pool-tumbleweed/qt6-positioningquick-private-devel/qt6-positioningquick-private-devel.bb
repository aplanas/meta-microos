SUMMARY = "Non-ABI stable API for the Qt 6 PositioningQuick Library"
DESCRIPTION = "This package provides private headers of libQt6PositioningQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-positioningquick-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "dbd1b580009ce8332af158eb01069e5b85627b3fb5a0b4fae345db0baba4cc0eeb7d0e14532637e00b50bd568e7eaebc483e5ffc91cd8114b69d83beedef5dcb"

RPROVIDES:${PN} += "qt6-positioningquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PositioningQuick \
qt6-positioning-private-devel \
qt6-quick-private-devel"

inherit rpm
