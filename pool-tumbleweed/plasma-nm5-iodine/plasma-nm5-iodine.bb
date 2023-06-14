SUMMARY = "VPN support for plasma-nm5"
DESCRIPTION = "Iodine (VPN through DNS tunnel) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-iodine-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "c4b35efa3bc5f2fcd3a7401e17a614aee1a1f9564e043cd3b0739583035ae08d790306e7a0d8fe1e5fd9a6ae091f4cf536da9457f1e404278a79809b2b758c05"

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
