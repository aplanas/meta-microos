SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickExtras library"
DESCRIPTION = "This package provides private headers of libQt63DQuickExtras that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickextras-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2448418ad1f3a6957c0a4ac8c50260ce4b325a82d5bd770d7d919140c1903cc3c2c31e6728068808bce351c55f686b2f8070a75507019e413aa2451f2fdc0710"

RPROVIDES:${PN} += "qt6-3dquickextras-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickExtras"

inherit rpm
