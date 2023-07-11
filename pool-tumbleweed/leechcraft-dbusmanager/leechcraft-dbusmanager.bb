SUMMARY = "LeechCraft D-Bus Module"
DESCRIPTION = "This package provides a D-Bus implementation plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-dbusmanager-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "547bd368695acf86cc570fd366549454a07fadd7c4825f12ecac4193544d5cc68abb57f418776542b698eedc42bcca54c3defd6c5ed9ed9c4f79bfe8f0b0574d"

RPROVIDES:${PN} += "leechcraft-dbusmanager \
libleechcraft-dbusmanager.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
