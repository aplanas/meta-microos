SUMMARY = "OpenConnect support for plasma-nm5"
DESCRIPTION = "OpenConnect plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-openconnect-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "45853593b78dbf66393d23793a294451638bb702c005fc208edfce023ab3bd330bc8c962305390d4293aa7629d4dad0c09908d4007de2d41fc254a0e1eb584b2"

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
