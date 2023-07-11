SUMMARY = "vpnc support for plasma-nm5"
DESCRIPTION = "vpnc plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-vpnc-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "a4623e80080d993a7ab1a50ec08c2bccc634ea3c9846e915c347526792cfaadc2d0abcc66d88f204adbb7b2c5d50f21fb06503f6789c12ba7ada7888276c36bf"

RPROVIDES:${PN} += "NetworkManager-vpnc-frontend \
plasma-nm-vpnc \
plasma-nm5-vpnc"

RDEPENDS:${PN} += "NetworkManager-vpnc \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
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
