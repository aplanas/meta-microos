SUMMARY = "SSTP support for plasma-nm5"
DESCRIPTION = "Secure Sockets Tunneling Protocol (SSTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-sstp-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "f0ec8dee2cea97c5bed221cdec6e3d4e5d579968169021dda4521dfdd1229e956c5647e26c27f0efa945c69797f9bcd23d99e22c804088ed890e3c35d2f6bc46"

RPROVIDES:${PN} += "NetworkManager-sstp-frontend \
plasma-nm5-sstp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
