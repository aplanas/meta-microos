SUMMARY = "FortiGate SSL VPN support for plasma-nm5"
DESCRIPTION = "FortiGate SSL VPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-fortisslvpn-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "57c88a8b2b788522c927a8e06bb99cc1873d0e25831e7944a50ff7de007fedea96a87e7a85423928339c9c402628960b09a4f2312f853be5c2853912252ecf8a"

RPROVIDES:${PN} += "NetworkManager-fortisslvpn-frontend \
plasma-nm5-fortisslvpn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma-nm5"

inherit rpm
