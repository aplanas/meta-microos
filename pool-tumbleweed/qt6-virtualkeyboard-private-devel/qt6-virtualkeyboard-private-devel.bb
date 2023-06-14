SUMMARY = "Non-ABI stable API for the Qt 6 VirtualKeyboard library"
DESCRIPTION = "This package provides private headers of libQt6VirtualKeyboard that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7103e78742fb54c415f5f030c7b222de6e4e3000e08a9444010713803cf67dfd797a44efeee8d87fc70aabffa0c9da13bffbac8937f1b374055823f989b89a2e"

RPROVIDES:${PN} += "qt6-virtualkeyboard-private-devel"

RDEPENDS:${PN} += "cmake-Qt6VirtualKeyboard \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
