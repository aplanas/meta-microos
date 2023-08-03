SUMMARY = "Non-ABI stable API for the Qt 6 WebView library"
DESCRIPTION = "This package provides private headers of libQt6WebView that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webview-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e54d24bb0f7ab600d40d6528804d501a91d20ad09ed2a5b1f06348eaae77a3203ea15bbf551acfd61419e38b74d30ab7a6b377d84b7e738f867e0f10495bd0ec"

RPROVIDES:${PN} += "qt6-webview-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebView \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
