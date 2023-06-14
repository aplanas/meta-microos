SUMMARY = "Network utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used \
network classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-network-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "1826d963303ed0b4b1e1970733547ab6d356727487d623cd25f5850140293a5703cf26650bb4033d9dafab1d3bd21f3bf66425205ef781d2e13bfa3c41edb0b0"

RPROVIDES:${PN} += "libleechcraft-util-network-qt5-0-6-75-1 \
libleechcraft-util-network-qt5.so.0.6.75.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
