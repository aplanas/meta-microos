SUMMARY = "LeechCraft HTTP authentication Module"
DESCRIPTION = "This package provides providing standard HTTP authentication facilities for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-namauth-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "efe8b7d71509612ce5179f08292ef2e1a46deb26c8c84705bb513d80ba0c29c4d309143d204f38f8e0b16171297764e39d49cb05dc80f85d553a221020a278e9"

RPROVIDES:${PN} += "leechcraft-namauth \
libleechcraft-namauth.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
