SUMMARY = "Database utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used database-related \
classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-db-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "92cfff48466787c22010f58a43ed3b5ddca6a469fa096206732d267aea5db01fbe712d5f5443def93e5393772e338c28bba54ecb80e26a02dd3ee44a815d8a6a"

RPROVIDES:${PN} += "libleechcraft-util-db-qt5-0-6-75-1 \
libleechcraft-util-db-qt5.so.0.6.75.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
