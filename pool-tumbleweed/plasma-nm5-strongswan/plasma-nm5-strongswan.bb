SUMMARY = "strongSwan support for plasma-nm5"
DESCRIPTION = "strongSwan plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-strongswan-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "f7d0f661aadcf74a1d5e7c62ac9204ece0a1e8c4f84ab36112c2eb2a34287f9808049c22af11ea68c41c41e4aedc445d1ec07d054ea8539b1cb40364a4a4c257"

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
