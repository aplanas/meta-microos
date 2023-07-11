SUMMARY = "OpenVPN support for plasma-nm5"
DESCRIPTION = "OpenVPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-openvpn-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "9075e452c8e9438eea1ae8985243ad47e980e04fb2e33ae244e70da1611247c1a5d7e8fa82bbf26f49299d5524ff202081ab4e5f971b5a0fe877895399c5b7a2"

RPROVIDES:${PN} += "NetworkManager-openvpn-frontend \
plasma-nm-openvpn \
plasma-nm5-openvpn"

RDEPENDS:${PN} += "NetworkManager-openvpn \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libglib-2.0.so.0 \
libnm.so.0 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma-nm5"

inherit rpm
