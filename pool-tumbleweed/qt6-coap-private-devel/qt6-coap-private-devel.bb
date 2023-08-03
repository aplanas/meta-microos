SUMMARY = "Non-ABI stable API for the Qt 6 CoAP library"
DESCRIPTION = "This package provides private headers of libQt6Coap that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-coap-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "56e14cd1173201abef0e6e7dcd724eff9c65c258568e506586232d12bda88e1e9df3884d915d7f8077b88528b774077da2f95ebc12961e4b13f5c3aad33be41f"

RPROVIDES:${PN} += "qt6-coap-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Coap \
cmake-Qt6Network \
qt6-core-private-devel"

inherit rpm
