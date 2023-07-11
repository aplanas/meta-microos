SUMMARY = "LeechCraft Azoth libpurple Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which \
makes the various protocols supported by libpurple available \
in Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-velvetbird-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "1e21e4615c69b9ed80fae8ccf9b19c0cf320fa80084b7ed33d2c6fca15e535975f428c5cfe674aea22b121ba4ba6a2facfa84fe1ee7ed66f16d0ad1be9f3aafb"

RPROVIDES:${PN} += "leechcraft-azoth-protocolplugin \
leechcraft-azoth-velvetbird \
libleechcraft-azoth-velvetbird.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libpurple.so.0 \
libstdc++.so.6"

inherit rpm
