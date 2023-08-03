SUMMARY = "Qt 6 JsonRpc library - Development files"
DESCRIPTION = "Development files for the Qt 6 JsonRpc library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-jsonrpc-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "fa8186530ff4d25104f8fd342e5476dc22f3fb2160b639211674e4e1ef0179d8ec0f44f6251c4d3d6e2160596a4b1d00d66b50b1f80869473efecde5de4e5048"

RPROVIDES:${PN} += "cmake-Qt6JsonRpcPrivate \
qt6-jsonrpc-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libQt6JsonRpc6"

inherit rpm
