SUMMARY = "LeechCraft Instant messenger Module"
DESCRIPTION = "This package provides a modular, multi-protocol IM client for LeechCraft. \
 \
Protocol support is provided by corresponding plugins. \
Unlike other multiprotocol clients which tend to implement only those \
features that are present in all the protocols, Azoth is modelled after the \
XMPP protocol, aiming to provide extensive and full support for XMPP while \
remaining usable for other protocols."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "33ed7e1a5fb673075b3b1b46ef46faab53ff2d95ee0d2a6d0ff3d16425e7ba5122614ef12df41c31a4b84e3663f0cb829ecb261bb2c5aded4d6f1d84de33554c"

RPROVIDES:${PN} += "leechcraft-azoth \
libleechcraft-azoth.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-azoth-chatstyler \
leechcraft-azoth-protocolplugin \
leechcraft-securestorage \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-models-qt5.so.0.6.75.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libleechcraft-util-threads-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-util-xsd-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libm.so.6 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
