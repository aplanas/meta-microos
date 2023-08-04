SUMMARY = "strongSwan support for plasma-nm5"
DESCRIPTION = "strongSwan plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-strongswan-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "bee858dae48ced7aa1d8001eba78f009f10c69504eef00dd53bb890370a05831b636af5debe6dfeba3d222b72a3235e2276f49a1e27ab2d74cc5a3b832dda102"

RPROVIDES:${PN} += "NetworkManager-strongswan-frontend \
plasma-nm-strongswan \
plasma-nm5-strongswan"

RDEPENDS:${PN} += "NetworkManager-strongswan \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
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
