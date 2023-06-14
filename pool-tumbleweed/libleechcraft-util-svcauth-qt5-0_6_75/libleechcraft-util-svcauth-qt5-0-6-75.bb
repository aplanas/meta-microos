SUMMARY = "Authenticators library for LeechCraft"
DESCRIPTION = "A library providing authenticators for various services like VKontakte."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-svcauth-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "59a60008e1ffd290c61a86cee9b86a05159e564623d7976171bdff89e5b0a42cd0ecc9aa74137b75daf352fad737b441425ee9ed23580a35072ebbe12b2cb2ae"

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
