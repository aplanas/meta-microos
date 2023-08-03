SUMMARY = "Non-ABI stable API for the Qt 6 OpcUa library"
DESCRIPTION = "This package provides private headers of libQt6Opcua that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-opcua-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f9fd190a0645c99260c5b9cede73cbe38dc63a32c5e6b20ce9e2c65df4f45ec953d8ade62426a8bc9fa4f3a43d05a5e1fe68bed61dd9651c17564f65f7f2883a"

RPROVIDES:${PN} += "qt6-opcua-private-devel"

RDEPENDS:${PN} += "cmake-Qt6OpcUa \
qt6-core-private-devel \
qt6-network-private-devel"

inherit rpm
