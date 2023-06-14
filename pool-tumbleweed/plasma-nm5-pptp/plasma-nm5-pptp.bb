SUMMARY = "PPTP support for plasma-nm5"
DESCRIPTION = "Point-To-Point Tunneling Protocol (PPTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-pptp-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "239e1f513b68255691605239f28296db8cf1e0b2ee42f510049e8c955cb537a038b3cbc28cac8d1fb194a8074d1f9936b5900e2d2ce95a23d6b3b2f1681b6f0f"

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
