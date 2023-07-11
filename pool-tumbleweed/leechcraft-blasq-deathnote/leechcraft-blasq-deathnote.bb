SUMMARY = "LeechCraft Blasq LiveJournal/FotoBilder client Module"
DESCRIPTION = "This package provides a LiveJournal FotoBilder image storage client subplugin \
for LeechCraft Blasq."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-blasq-deathnote-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "3471683832f4be9ca2146a8e8322932d9976c8f83d7322bb4ba799b71e716d0f863b25865fe4a280ae11083b5b1b166128bc701f2c961b15e6ef928256e8ab32"

RPROVIDES:${PN} += "leechcraft-blasq-deathnote \
leechcraft-blasq-subplugin \
libleechcraft-blasq-deathnote.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-blasq \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
