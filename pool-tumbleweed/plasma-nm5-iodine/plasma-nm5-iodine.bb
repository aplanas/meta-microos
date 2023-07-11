SUMMARY = "VPN support for plasma-nm5"
DESCRIPTION = "Iodine (VPN through DNS tunnel) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-iodine-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "25fab79516b8599b8d84dd044c4a75824a9d608efd7811f100c4a9cedefe0d5d2a0b0688a4fa9ae8c0351565a55a7a26f461a0d3c1061b28a344cae6f50ab1cf"

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
