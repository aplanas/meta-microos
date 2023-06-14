SUMMARY = "Standard LeechCraft Library"
DESCRIPTION = "A library providing some classes and algorithms, not directly \
related to any other library."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-sll-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "e32e4312454e6482c6940dd29a89f33e814fc99019f0753cef0928d0930e098d418a954876418bfa81b20e4a5fb548f3296a45ded0cb1d119585e3980356439a"

RPROVIDES:${PN} += "libleechcraft-util-sll-qt5-0-6-75-1 \
libleechcraft-util-sll-qt5.so.0.6.75.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpcre.so.1 \
libstdc++.so.6"

inherit rpm
