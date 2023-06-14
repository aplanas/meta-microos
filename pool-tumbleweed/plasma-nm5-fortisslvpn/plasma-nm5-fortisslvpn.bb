SUMMARY = "FortiGate SSL VPN support for plasma-nm5"
DESCRIPTION = "FortiGate SSL VPN plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-fortisslvpn-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "0c0c50ea69ecd9afa72862d7e77c944517ea6bda1bb9b2b9dcfa04fdde98c6d5cf686362d323158c557757a0067ac24d17ebfa90dbce5e61136c0295c4793909"

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
