SUMMARY = "LeechCraft Poshuku Onlinebookmarks Delicious Module"
DESCRIPTION = "This package contains a plugin for LeechCraft Poshuku Online Bookmarks \
to support the Del.icio.us service."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-onlinebookmarks-delicious-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "26db49d7450d10d7d590d5fbd7a0d1d52f380aae7754edb48668bd3a2e180cc92d18e06439be8b7451919c2c9554c70ab6d950a17d73664363858d99a25c148d"

RPROVIDES:${PN} += "leechcraft-poshuku-onlinebookmarks-delicious \
libleechcraft-poshuku-onlinebookmarks-delicious.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku-onlinebookmarks \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
