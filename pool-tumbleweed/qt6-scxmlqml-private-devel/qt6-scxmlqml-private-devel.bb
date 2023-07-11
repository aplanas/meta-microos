SUMMARY = "Non-ABI stable API for the Qt 6 ScxmlQml library"
DESCRIPTION = "This package provides private headers of libQt6ScxmlQml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxmlqml-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b143db764e61b29fa007e071090fbc893ac78e6e0c028c9714fe068476bd069561031121574d904fa412b6f329bdf964632b014815747447a7055437f5611387"

RPROVIDES:${PN} += "qt6-scxmlqml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6ScxmlQml"

inherit rpm
