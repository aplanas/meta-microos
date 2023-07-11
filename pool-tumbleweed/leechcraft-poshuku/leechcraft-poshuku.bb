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

RPM_NAME = "leechcraft-poshuku-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "cf03856776a5b99637e3333560dc717a870fd2ece694cae19f2d30886998e81ab0a6246e7b817e89a1b753965b9973b19d3648e95f0fef6f1050a3b25e9aebc8"

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
