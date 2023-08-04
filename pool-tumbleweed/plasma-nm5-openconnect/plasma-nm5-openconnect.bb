SUMMARY = "OpenConnect support for plasma-nm5"
DESCRIPTION = "OpenConnect plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-openconnect-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "306f344a549c33d5a6a8f76db0546f0e72671e02e16f247822ab0cc5c6795f33710398c71c409afef49204af0f1bc08d4388b6ffdc91a88116004074601e4dc7"

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
