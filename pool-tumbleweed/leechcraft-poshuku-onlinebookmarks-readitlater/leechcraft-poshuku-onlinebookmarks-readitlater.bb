SUMMARY = "LeechCraft Poshuku Onlinebookmarks ReadItLater Module"
DESCRIPTION = "This package contains a plugin for LeechCraft Poshuku Online Bookmarks \
to support the Read it Later service."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-onlinebookmarks-readitlater-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "e0988fb78eca5a1f7dc3044cb2ec4ae60d87bfe95b61c5ddecb0a09cb170e7587963dc61da14cd90dbef8f56cba92e2dd7cf85bcbe32e20ae83b5be93e72f088"

RPROVIDES:${PN} += "leechcraft-poshuku-onlinebookmarks-readitlater \
libleechcraft-poshuku-onlinebookmarks-readitlater.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku-onlinebookmarks \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
