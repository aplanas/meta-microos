SUMMARY = "Examples for the qt6-webview modules"
DESCRIPTION = "Examples for the qt6-webview modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webview-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5b126769267429215b6b1a0c83860da16c08a2a4e36ac851529cb4ca781077f04478160f6b78a442371103688113f0d5850e46024d990834089509ff92e0f026"

RPROVIDES:${PN} += "qt6-webview-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6WebView.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
