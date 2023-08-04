SUMMARY = "OpenVPN support for plasma-nm5"
DESCRIPTION = "OpenVPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-openvpn-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "3f1a4f8cbf8b038183df888f8cc63a11533fcb39debd920058000b032ee2dbb7f4a0dcaf224d8438fcb70374ded67a5eeed9559fda633edbdc092999f1aa716c"

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
