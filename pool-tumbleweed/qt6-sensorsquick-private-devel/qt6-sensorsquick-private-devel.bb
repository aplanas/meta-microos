SUMMARY = "Non-ABI stable API for the Qt 6 SensorsQuick library"
DESCRIPTION = "This package provides private headers of libQt6SensorsQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-sensorsquick-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c08923fa10ab85e1e780ec2c46adf75b374fac93f1dcd811ce700e458281ed9f03332ab6c1b9bed5b02f37985591a1140b857319c022db8516f57d7e22cac97f"

RPROVIDES:${PN} += "qt6-sensorsquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6SensorsQuick"

inherit rpm
