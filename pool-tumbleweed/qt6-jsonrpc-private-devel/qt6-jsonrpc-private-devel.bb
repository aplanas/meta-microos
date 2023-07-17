SUMMARY = "Qt 6 JsonRpc library - Development files"
DESCRIPTION = "Development files for the Qt 6 JsonRpc library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-jsonrpc-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "3ac308a23d34feec81e9c3c9af468a426fa0b282ac5da5a4a41bf5827e9ce8496645046f7938d3113bd128f629ab64259207b51269dd3c7a18493b3513caa8e4"

RPROVIDES:${PN} += "cmake-Qt6JsonRpcPrivate \
qt6-jsonrpc-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libQt6JsonRpc6"

inherit rpm
