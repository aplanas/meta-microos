SUMMARY = "Non-ABI stable API for the Qt 6 Sensors library"
DESCRIPTION = "This package provides private headers of libQt6Sensors that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-sensors-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2da1cc2029d2183fee449eef9ddae1281d1bdc6fb2faab59fec3ff65d5eb7446166c0b61a73344a200de6087ea3b197a38eafc8ff39a1363b3bf549ea9b9358b"

RPROVIDES:${PN} += "qt6-sensors-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Sensors \
qt6-core-private-devel"

inherit rpm
