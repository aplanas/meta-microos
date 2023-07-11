SUMMARY = "LeechCraft Blasq VKontakte client Module"
DESCRIPTION = "This package provides a VKontakte image storage client subplugin \
for LeechCraft Blasq."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-blasq-rappor-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "3d4fb5a828ee7e54cb7cd0b181634e21da47a07e36dccf8be8eace34e756d27b1547813d6763b29b6707c821d3e5f0c5f53165418992d966f48c4bc0e2b1e927"

RPROVIDES:${PN} += "leechcraft-blasq-rappor \
leechcraft-blasq-subplugin \
libleechcraft-blasq-rappor.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-blasq \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-svcauth-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
