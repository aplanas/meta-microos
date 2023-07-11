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

RPM_NAME = "leechcraft-azoth-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "aba3d1ed01d3ed586a168998212175d1715604c0344654ab099e406dbcfc488fbc6ee3f0453cb359d91656d8de3b82bac65210839d5ac10009397e584eb943c1"

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
