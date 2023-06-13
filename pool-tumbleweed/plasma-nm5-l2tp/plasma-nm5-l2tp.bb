SUMMARY = "L2TP support for plasma-nm5"
DESCRIPTION = "Layer Two Tunneling Protocol (L2TP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-l2tp-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "7d7dbfb2575a223bed8b8da38df8618efcba7292fc208cc757e32a4b1ee31bac771e3eac323982b1795e811b8823e2d2086de119d0428a629c4e4ca1af683b44"

RPROVIDES:${PN} += "NetworkManager-l2tp-frontend \
plasma-nm-l2tp \
plasma-nm5-l2tp \
plasma-nm5-l2tp(aarch-64)"

RDEPENDS:${PN} += "NetworkManager-l2tp \
ld-linux-aarch64.so.1()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NetworkManagerQt.so.6()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libplasmanm_editor.so()(64bit) \
libstdc++.so.6()(64bit) \
plasma-nm5"

inherit rpm
