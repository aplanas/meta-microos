SUMMARY = "PPTP support for plasma-nm5"
DESCRIPTION = "Point-To-Point Tunneling Protocol (PPTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-pptp-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "032dd85a89c2cb994792f0424cfaefee2427db8580ed51b4b79182db20c4f9eac4481d6c91dea71c8452efa2f2e7793f6a9ba2d2ef95a43ee8f57aeabb52eaa4"

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
