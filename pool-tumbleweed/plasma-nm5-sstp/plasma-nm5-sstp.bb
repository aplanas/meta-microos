SUMMARY = "SSTP support for plasma-nm5"
DESCRIPTION = "Secure Sockets Tunneling Protocol (SSTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-sstp-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "a1c68ef1653f538fe746f28244ef75a1ca92c3d85ea6c9dfef9d563f8835144824d170957daadcfb721e06ad4a233aa0f53e5fb9a388c285d27331acc102b989"

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
