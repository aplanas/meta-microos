SUMMARY = "LeechCraft Web Browser Module"
DESCRIPTION = "This package provides a WebEngine-based web browser plugin for LeechCraft. \
Poshuku is extensible with plugins. \
 \
Currently it features: \
 * integration with other plugins; \
 * autodiscovery; \
 * tagging bookmarks; \
 * support for SQLite or PostgreSQL storage."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b453bc35e91a9950a333e27834fcc952aee8e7d42fecbb13a02075383d5cb432a07a8f7a871c4d879f82ff0b5752c19003d55529b809c91aef540ab9a468acc1"

RPROVIDES:${PN} += "leechcraft-poshuku \
libleechcraft-poshuku.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-poshuku-backend \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libidn.so.12 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-models-qt5.so.0.6.75.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-util-xsd-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
