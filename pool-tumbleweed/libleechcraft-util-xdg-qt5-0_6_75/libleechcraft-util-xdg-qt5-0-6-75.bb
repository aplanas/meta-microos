SUMMARY = "XDG utility library for LeechCraft"
DESCRIPTION = "A library providing XDG parsers and other support methods and classes \
for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-xdg-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "3e5e123bbcff6c2b039677d514c610f5a967673030a0a69f40d270032aa14c7b4b00c19590ca97f5720b8a374959750591089c6b52f660a8ccd31c5b846b1f2a"

RPROVIDES:${PN} += "libleechcraft-util-xdg-qt5-0-6-75 \
libleechcraft-util-xdg-qt5.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
