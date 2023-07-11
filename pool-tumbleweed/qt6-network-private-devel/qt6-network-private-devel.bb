SUMMARY = "Non-ABI stable API for the Qt 6 Network library"
DESCRIPTION = "This package provides private headers of libQt6Network that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-network-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "5677603e8e9cad4e98cf0160d81d7fcc97c6304c7e8137dc8d8999c35bb6c61b80131ee9249efcd671175d24e8ef615a1f3d649ae3374b2f7030109ea3e93382"

RPROVIDES:${PN} += "qt6-network-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
libopenssl-3-devel \
qt6-core-private-devel"

inherit rpm
