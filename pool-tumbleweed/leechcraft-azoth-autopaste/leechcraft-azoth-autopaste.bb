SUMMARY = "LeechCraft Azoth Autopaste Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth with \
which long messages can automatically be pasted to pastebins."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-autopaste-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "71c13d63ea379a2b2547454a155f76410420d39c68db4268360733c44a98e12d0b8d7b97fe66ebdc74fd08f9c1c795a1f1d2ba3b8f0292837cb1b7b2b7173bf0"

RPROVIDES:${PN} += "leechcraft-azoth-autopaste \
libleechcraft-azoth-autopaste.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
