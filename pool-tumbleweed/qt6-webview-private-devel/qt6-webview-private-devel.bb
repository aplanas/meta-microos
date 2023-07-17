SUMMARY = "Non-ABI stable API for the Qt 6 WebView library"
DESCRIPTION = "This package provides private headers of libQt6WebView that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8c09a83ab3cf71959b0d7cf41ec5c99f8fdc64a50361c2a086a75db2d78e3818ed4a77574a3fe8802918334370fb46f3fc19c285c3f31d25cff8c240ea4aab72"

RPROVIDES:${PN} += "qt6-webview-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebView \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
