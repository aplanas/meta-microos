SUMMARY = "Libreswan support for plasma-nm5"
DESCRIPTION = "Libreswan plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-libreswan-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "d63a4c57692868ae88d3329619e966d2870bc620c392846c4257364e164226b43ed59e51d89f57d6ff31957c33dbb6e419f76d0a459d2a5ae2069b1f6d64304e"

RPROVIDES:${PN} += "NetworkManager-libreswan-frontend \
plasma-nm-openswan \
plasma-nm5-libreswan \
plasma-nm5-openswan"

RDEPENDS:${PN} += "NetworkManager-libreswan \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma-nm5"

inherit rpm
