SUMMARY = "LeechCraft Importer Module"
DESCRIPTION = "This package provides a settings importer plugin for LeechCraft \
which can import settings, preferences, etc. from various applications. \
 \
Currently it supports \
 * Kopete: chat history. \
 * Psi+: account settings, chat history. \
 * Vacuum IM: account settings, chat history. \
 * Akregator: feeds list, individual settings for each feed, like \
update interval and custom storage parameters, Akregator's settings. \
 * Firefox: history, bookmarks, RSS feeds (aka Live bookmarks). \
 * Liferea: feeds list."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-newlife-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "782a74eade5f354fa37027b300bcce4c835c14e044c62f181441681412355f12f29de324c9be4958850cb29265c2582697a1ef9306a9f0f60aa8e12b12649912"

RPROVIDES:${PN} += "leechcraft-newlife \
libleechcraft-newlife.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
