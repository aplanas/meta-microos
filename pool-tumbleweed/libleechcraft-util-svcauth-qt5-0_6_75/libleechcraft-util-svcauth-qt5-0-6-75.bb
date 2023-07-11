SUMMARY = "Authenticators library for LeechCraft"
DESCRIPTION = "A library providing authenticators for various services like VKontakte."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-svcauth-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "bce0a1e5be70cb82d01f82df9e56e3c6bc106aba4c4445a599f75b2b918a04a04e52d7b1239f309df1f1e644d4a0a76f38732d62c64320c4d33e7f8002f94ca7"

RPROVIDES:${PN} += "libleechcraft-util-svcauth-qt5-0-6-75 \
libleechcraft-util-svcauth-qt5.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
