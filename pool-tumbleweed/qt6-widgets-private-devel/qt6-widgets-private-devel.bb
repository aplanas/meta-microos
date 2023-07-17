SUMMARY = "Non-ABI stable API for the Qt 6 Widgets library"
DESCRIPTION = "This package provides private headers of libQt6Widgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-widgets-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "f4f6f5870343b9e717000f62b295e37224fa56ffaf6163db57ef1bbbb1e5b7e7a1736fb761634534be168f5af9f3588a0e553a4df0878a9d47c1174e307f56ab"

RPROVIDES:${PN} += "qt6-widgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
