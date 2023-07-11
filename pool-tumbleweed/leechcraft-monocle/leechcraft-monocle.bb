SUMMARY = "LeechCraft Document viewer Module"
DESCRIPTION = "This package provides a modular document viewer plugin for LeechCraft \
which supports different formats via backends."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "485380fad99a08711f0df023b98fd46e626be19ea0cd41f6ee4d5cee052945ca4c056db1758a2781994b49861b44ff90c7438f2eb44385c20986d7030063558b"

RPROVIDES:${PN} += "leechcraft-monocle \
libleechcraft-monocle.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle-subplugin \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
