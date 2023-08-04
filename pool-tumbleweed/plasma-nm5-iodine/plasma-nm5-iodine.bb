SUMMARY = "VPN support for plasma-nm5"
DESCRIPTION = "Iodine (VPN through DNS tunnel) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-iodine-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "642e822655d4e6ae06cffbd86f78184c565f47362dc15f5ed3cbcdfc30fc8e134c73f4bce11c42c2445d860f9e9463e28455f8bd39be49767d482121571dd556"

RPROVIDES:${PN} += "NetworkManager-iodine-frontend \
plasma-nm5-iodine"

RDEPENDS:${PN} += "NetworkManager-iodine \
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
