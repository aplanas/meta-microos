SUMMARY = "Non-ABI stable API for the Qt 6 LabsSettings library"
DESCRIPTION = "This package provides private headers of libQt6LabsSettings that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-labssettings-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "75fbbb1731aa94439dae2c5815020f329a8ca92da6daf76acd9b2aa8324c799765e131260531793667360cac64fd737a07ed2b653e4e0c605953512755705644"

RPROVIDES:${PN} += "qt6-labssettings-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsSettings"

inherit rpm
