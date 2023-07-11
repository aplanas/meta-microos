SUMMARY = "FortiGate SSL VPN support for plasma-nm5"
DESCRIPTION = "FortiGate SSL VPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-fortisslvpn-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "7d07938b6ed8136ebe9268e90f5a9f1a059776c5b2b29aed0e7423b6e929ed105988913ac3375bcf975e51614d2d644f2036b28599f2e89a99fd2604e4a06b45"

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
