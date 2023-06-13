SUMMARY = "Non-ABI stable API for the Qt 6 SensorsQuick library"
DESCRIPTION = "This package provides private headers of libQt6SensorsQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensorsquick-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "722fcf9afef54950df49e729067181581cd659e256e3c6af332e39a30c7178c7186fcda15526981ae4a98494f6faacd41d9f63a34b1687e150bdd0ca5aa100c5"

RPROVIDES:${PN} += "qt6-sensorsquick-private-devel \
qt6-sensorsquick-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6SensorsQuick)"

inherit rpm
