SUMMARY = "Network utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used \
network classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-network-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "addd7a5bf3ed2a2c5f2ab4d0c017d0d1f2433fcd0e69e2378d59880af5b14ec933b4067d710bb9573ea7636d8bed2540ad9b5fb0de8db0c4544ec14a3a110602"

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
