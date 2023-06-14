SUMMARY = "GUI utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used GUI-related \
widgets, classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-gui-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "e0ccc20b864202f43c2d21e1ba0a73fbb324c0db1d275709dc7bc86f360d3a0ad67b266b6ebd08506718b870612dded8d250ca3870fe9682ff673008853765ac"

RPROVIDES:${PN} += "libleechcraft-util-gui-qt5-0-6-75-1 \
libleechcraft-util-gui-qt5.so.0.6.75.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
