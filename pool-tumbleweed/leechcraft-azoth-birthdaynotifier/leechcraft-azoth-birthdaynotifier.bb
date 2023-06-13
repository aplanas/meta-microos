SUMMARY = "LeechCraft Azoth Birthday Notifier Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth with which you \
will be notified of your contacts' birthdays if they are present in \
vCards."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-birthdaynotifier-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "196a444eaf4a6d16be4ce55ae574db25811c9436340407cbc2f0f9f983b8314269e433d47a395a99b79632b91b920b422880f663c05756802b28b1436226f0fa"

RPROVIDES:${PN} += "leechcraft-azoth-birthdaynotifier \
leechcraft-azoth-birthdaynotifier(aarch-64) \
libleechcraft_azoth_birthdaynotifier.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft-azoth \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
