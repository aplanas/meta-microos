SUMMARY = "Libreswan support for plasma-nm5"
DESCRIPTION = "Libreswan plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-libreswan-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "d6bd0fe297fa13799728be9fa7378fde53c972da90b9090b2f2bb1b672a327f79b4c4db04a30e9f93d92c0f206b363e52c2b7a734e80c6b39fe8ed231bf9855c"

RPROVIDES:${PN} += "NetworkManager-libreswan-frontend \
plasma-nm-openswan \
plasma-nm5-libreswan \
plasma-nm5-openswan"

RDEPENDS:${PN} += "NetworkManager-libreswan \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma-nm5"

inherit rpm
