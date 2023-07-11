SUMMARY = "LeechCraft Security manager Module"
DESCRIPTION = "This package provides a security manager plugin for LeechCraft. \
 \
It is the base module for secure storage. \
Particular storage backends are implemented by subplugins."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-secman-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "73aa71714df1bb572d084367d8b3a0b28d3331571a7b7951192458f86db57377b22d4f77043e3ca373e220f360cf21893f71783b81b8b173c8752f81e0498deb"

RPROVIDES:${PN} += "leechcraft-secman \
leechcraft-securestorage \
libleechcraft-secman.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-secman-simplestorage \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
