SUMMARY = "Non-ABI stable API for the Qt 6 QuickLayouts library"
DESCRIPTION = "This package provides private headers of libQt6QuickLayouts that do not have \
any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quicklayouts-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "39a31b3b27ce935935f7003eb76df66f95c072e7cd167dfefc5c61eb2c8ffb60b061c0448d6a02aa51fe1ca67a70929b8d83b4249b9ccfe3c3a9df5494d862ce"

RPROVIDES:${PN} += "qt6-quicklayouts-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickLayouts"

inherit rpm
