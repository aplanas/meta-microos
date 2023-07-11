SUMMARY = "L2TP support for plasma-nm5"
DESCRIPTION = "Layer Two Tunneling Protocol (L2TP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-l2tp-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "d55af644c03ba276c6e161849a1fd738ea2755064b34b314a2674cd5f166d11ecb71e035741c3fb12fbad3a78a8c04c465cf561ee481ea375e8433b66a6f91a7"

RPROVIDES:${PN} += "NetworkManager-l2tp-frontend \
plasma-nm-l2tp \
plasma-nm5-l2tp"

RDEPENDS:${PN} += "NetworkManager-l2tp \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma-nm5"

inherit rpm
