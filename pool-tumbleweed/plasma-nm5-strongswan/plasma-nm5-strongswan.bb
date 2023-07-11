SUMMARY = "strongSwan support for plasma-nm5"
DESCRIPTION = "strongSwan plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-strongswan-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "59b82ee84e78e2294a3238898d0666f39a3ad5d1a9834ab61caa92a15d7f06700541a83c95c3238fdabe29050b31deb641b50f843c34022ad2ff4cab25285508"

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
