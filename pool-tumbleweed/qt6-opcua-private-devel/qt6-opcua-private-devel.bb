SUMMARY = "Non-ABI stable API for the Qt 6 OpcUa library"
DESCRIPTION = "This package provides private headers of libQt6Opcua that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fa2e5e1de8bf970e4479b368f154acb6f4e6808608e95dbf0019bd34d640acafe20d18fad29fe35fe29f6a327a314d91446db180b8516f9bbf10d20b28a6971a"

RPROVIDES:${PN} += "qt6-opcua-private-devel"

RDEPENDS:${PN} += "cmake-Qt6OpcUa \
qt6-core-private-devel \
qt6-network-private-devel"

inherit rpm
