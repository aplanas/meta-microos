SUMMARY = "Non-ABI stable API for the Qt 6 Sensors library"
DESCRIPTION = "This package provides private headers of libQt6Sensors that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e54474cecf396acafec8aa83da9d46ea8b4dc92fecb7a1f208f88b6149ecf12a7bcd5142fff7e938abe4b95e556bf0a2f2c2d54370fbdad8948fbdc9535d74a9"

RPROVIDES:${PN} += "qt6-sensors-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Sensors"

inherit rpm
