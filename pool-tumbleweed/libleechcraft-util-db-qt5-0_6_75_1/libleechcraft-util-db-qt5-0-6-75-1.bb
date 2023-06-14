SUMMARY = "Database utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used database-related \
classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-db-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "12fe139aa878626f8fefe13a693fb1058e7014da2ee3f7f39c62dba5a7b1dd2a3bd51b4c53c3357f0889cba41ad7441dc41f7381ed596afeac3952b60c9fc6b6"

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
