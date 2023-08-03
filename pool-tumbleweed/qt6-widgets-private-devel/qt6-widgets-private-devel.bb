SUMMARY = "Non-ABI stable API for the Qt 6 Widgets library"
DESCRIPTION = "This package provides private headers of libQt6Widgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-widgets-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d64490622a1bad0ec1327056a02d6db1beaa8f90879691cd5720ae058c5d97b505fe6207a628ec7a85b24182229d55ec95306d073325d0b7a697106d892551d7"

RPROVIDES:${PN} += "qt6-widgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
