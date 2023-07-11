SUMMARY = "Standard LeechCraft Library"
DESCRIPTION = "A library providing some classes and algorithms, not directly \
related to any other library."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-sll-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "00d273a1e0f64023a819745a3a59d3c3ab32fe5d1d21ef3bf100a369525e66c39c25666cf6d95c1dc89af01037659746e60e3652e37ed86f52e3598ec4aeba31"

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
