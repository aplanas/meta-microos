SUMMARY = "LeechCraft Azoth IRC Module"
DESCRIPTION = "This package provides an IRC protocol plugin for LeechCraft Azoth. \
 \
Features: \
 * Secure Sockets Layer (SSL) cryptographic protocol. \
 * Channel bookmarks. \
 * Automatic password entry. \
 * Automatic login."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-acetamide-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "909fb51dbb7636376ac46309e33f363e9455882b23d0b210fd15ad6e9e47bd6e81732703713ce236cdc7e10290bebb240b17e52d81ff15966fe8c3f85635fb4a"

RPROVIDES:${PN} += "leechcraft-azoth-acetamide \
leechcraft-azoth-protocolplugin \
libleechcraft-azoth-acetamide.so"

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
