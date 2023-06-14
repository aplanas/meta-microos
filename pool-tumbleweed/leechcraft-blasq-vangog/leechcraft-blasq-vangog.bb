SUMMARY = "LeechCraft Blasq Picasa client Module"
DESCRIPTION = "This package provides a Picasa image storage client subplugin \
for LeechCraft Blasq."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-blasq-vangog-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "6889ccf5a54275115fa63c74899db68eeaf1973a9cb61da6bf7e4185cbae47efc3909c06cb045116ba584f722e358ec579d6ab78542f17c41af091a361f90884"

RPROVIDES:${PN} += "leechcraft-blasq-subplugin \
leechcraft-blasq-vangog \
libleechcraft-blasq-vangog.so"

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
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
