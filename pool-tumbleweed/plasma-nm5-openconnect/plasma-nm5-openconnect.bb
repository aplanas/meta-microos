SUMMARY = "OpenConnect support for plasma-nm5"
DESCRIPTION = "OpenConnect plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-openconnect-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "b6c6cfb83b9f4a0127dbf31304c2cd6d7c09789d8b0cd82c798478a17535f4a0d0eb9d4c7bb62f0e007aba57bf1580492ed2b70f5a91274f0d854b6cd11e0eed"

RPROVIDES:${PN} += "NetworkManager-openconnect-frontend \
plasma-nm-openconnect \
plasma-nm5-openconnect"

RDEPENDS:${PN} += "NetworkManager-openconnect \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libopenconnect.so.5 \
libplasmanm-editor.so \
libstdc++.so.6 \
openconnect \
plasma-nm5"

inherit rpm
