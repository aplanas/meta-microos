SUMMARY = "OpenVPN support for plasma-nm5"
DESCRIPTION = "OpenVPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-openvpn-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "35fde0dc81b58730700dbe7dbaccd941d90dd18727189e8e1d1013479217afae18bcb77866d0464b4284de0a83b098cf431cf1d26e35269aded750aa7814a4b3"

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
