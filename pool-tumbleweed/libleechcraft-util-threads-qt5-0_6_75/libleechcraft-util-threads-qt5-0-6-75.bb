SUMMARY = "Thread utility library for LeechCraft"
DESCRIPTION = "A library providing some classes and functions commonly used \
with the LeechCraft threads subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-threads-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "9b90e698c434a2880d744149195b6d692a847284ad12e077ea8c4864d1b96c5ced7ad3ffda34d90a0df12a43aff62d22ba4fe7104a3aadb8442d757aa9076022"

RPROVIDES:${PN} += "libleechcraft-util-threads-qt5-0-6-75 \
libleechcraft-util-threads-qt5.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
