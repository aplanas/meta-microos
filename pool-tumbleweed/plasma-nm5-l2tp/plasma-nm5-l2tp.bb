SUMMARY = "L2TP support for plasma-nm5"
DESCRIPTION = "Layer Two Tunneling Protocol (L2TP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-l2tp-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "9d8be7b52e8e1c820e0950f223855258e64cab7ad7d1227f41efcdffb9959815ab1295dd1bd1b1cd0efcfacfbbab453c15ffd022b64f7f4296af51de963678c8"

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
