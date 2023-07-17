SUMMARY = "Examples for the qt6-webview modules"
DESCRIPTION = "Examples for the qt6-webview modules."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-webview-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "4ce860ab3c10bd8f115ab52d7c515c71dee00c5185f46fe928380b70f1490fc53f744a9c2efaf3be04ba6c35dde9f6bbb3a7f8f2462427df25b065f482c0f083"

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
