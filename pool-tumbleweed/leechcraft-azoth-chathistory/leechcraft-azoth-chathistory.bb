SUMMARY = "LeechCraft Azoth Chat history Module"
DESCRIPTION = "This package provides a chat history plugin for LeechCraft Azoth. \
It supports storing history from normal one-to-one chats as well as from \
multiuser conferences and private chats in conferences. It also allows to \
search the logs with SQL's LIKE expressions. SQLite is used for storage."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-chathistory-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "d5b0496bcca679ed6d55f9e620a2bee22674c3f772cbb64a047405b16c162ef0ca4ffd0cee36f0f4d3a78d613c69e1fa995ac21d50c7fe29495b3cc82b747293"

RPROVIDES:${PN} += "leechcraft-azoth-chathistory \
libleechcraft-azoth-chathistory.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-threads-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
