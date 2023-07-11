SUMMARY = "Non-ABI stable API for the Qt 6 VirtualKeyboard library"
DESCRIPTION = "This package provides private headers of libQt6VirtualKeyboard that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "22857d3281d659f4da940e4e5c8ba415f4f181ece159d7aba71b4b6482dced003d312881826fc7cc3f829fc963bc5c3b55c290f5ff72980485ec554e0c74ddfd"

RPROVIDES:${PN} += "qt6-virtualkeyboard-private-devel"

RDEPENDS:${PN} += "cmake-Qt6VirtualKeyboard \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
