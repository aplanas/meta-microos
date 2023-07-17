SUMMARY = "Non-ABI stable API for the Qt 6 Sensors library"
DESCRIPTION = "This package provides private headers of libQt6Sensors that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d528f4b3e0b4ae7b8f3f9951a192b1038a6f68d08906d556b7fdb4db9ad1923249377200068c16fb2665c288f1c43f2c284d07a4babf019f9089fff2405bb4af"

RPROVIDES:${PN} += "qt6-sensors-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Sensors \
qt6-core-private-devel"

inherit rpm
