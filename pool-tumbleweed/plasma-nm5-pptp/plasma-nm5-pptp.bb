SUMMARY = "PPTP support for plasma-nm5"
DESCRIPTION = "Point-To-Point Tunneling Protocol (PPTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-pptp-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "6a34f086ff7a06c65defeefd8fc3bcb23a3886f8909e44a9ed36d15bcaedabd6d7a5dabb185641bfab49c2f2bd00d9fd0a2784b55117685f3ae0a56b2dfd61a3"

RPROVIDES:${PN} += "NetworkManager-pptp-frontend \
plasma-nm-pptp \
plasma-nm5-pptp"

RDEPENDS:${PN} += "NetworkManager-pptp \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma-nm5"

inherit rpm
