SUMMARY = "LeechCraft Azoth - VKontakte Module"
DESCRIPTION = "This package provides a special protocol subplugin for extensive VKontakte \
messaging support for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-murm-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "9b624b656c4903beacb349ddc9693620cea81b713063c5d743e43ee667195e20555d0c9ff04e210986e79bb40ec3d3b56e99533af1222896d6d45a8691c65926"

RPROVIDES:${PN} += "leechcraft-azoth-murm \
leechcraft-azoth-protocolplugin \
libleechcraft-azoth-murm.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-svcauth-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
