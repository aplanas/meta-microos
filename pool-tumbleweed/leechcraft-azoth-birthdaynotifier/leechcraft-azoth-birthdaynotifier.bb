SUMMARY = "LeechCraft Azoth Birthday Notifier Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth with which you \
will be notified of your contacts' birthdays if they are present in \
vCards."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-birthdaynotifier-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "196a444eaf4a6d16be4ce55ae574db25811c9436340407cbc2f0f9f983b8314269e433d47a395a99b79632b91b920b422880f663c05756802b28b1436226f0fa"

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
