SUMMARY = "SSTP support for plasma-nm5"
DESCRIPTION = "Secure Sockets Tunneling Protocol (SSTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-sstp-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "37379412c6fce88c3cc4d725afe884dbca226d01449aaec3f31579310374597931d4eed430d113dbcc97f54605037fde571065041490b1801baaa32a4cc7e165"

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
