SUMMARY = "LeechCraft Package manager Module"
DESCRIPTION = "This package provides a package manager plugin for Leechcraft. \
 \
It allows to install script plugins, iconsets, translations, additional data \
and other similar packages. \
 \
It also supports dependencies between packages as well as versioning and \
automatic updates of the packages. \
 \
Features: \
 * Allows installation of script plugins, icons and various other data. \
 * Supports versioning and automatic updates of packages. \
 * Supports dependencies between packages. \
 * Operates in user's home directory."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lackman-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "ca82040611fe060b0cd717152fa1243c6541f0028328735031347dec82103a25fed801a39570e46bb93d122eac0a04296a33fc933b73a29fc4889ecb716cd9f0"

RPROVIDES:${PN} += "leechcraft-lackman \
libleechcraft-lackman.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6 \
xz"

inherit rpm
