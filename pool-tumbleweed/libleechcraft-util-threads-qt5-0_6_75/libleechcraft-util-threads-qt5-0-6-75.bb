SUMMARY = "Thread utility library for LeechCraft"
DESCRIPTION = "A library providing some classes and functions commonly used \
with the LeechCraft threads subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-threads-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "cbbf3bcf9a725b13841ad30b97c6195aaff442d39adb326d6075a8e5e10e06276a82674a84013cf4831278e19bc259b21d5d6531dfbadb5a228a5b8fc4fa35a6"

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
