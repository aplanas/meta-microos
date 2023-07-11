SUMMARY = "LeechCraft Azoth Birthday Notifier Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth with which you \
will be notified of your contacts' birthdays if they are present in \
vCards."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-birthdaynotifier-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "d3d591c58cc5aafd1daf3ed1869b431d44f82416b739d7865538f7e3c0287572c53c5604eafcd7660afa1b6f39adeadd6d7dc10b044aa8481bd4b5214051c308"

RPROVIDES:${PN} += "leechcraft-azoth-birthdaynotifier \
libleechcraft-azoth-birthdaynotifier.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
