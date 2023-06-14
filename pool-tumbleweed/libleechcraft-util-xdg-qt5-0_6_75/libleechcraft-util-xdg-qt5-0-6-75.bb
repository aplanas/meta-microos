SUMMARY = "XDG utility library for LeechCraft"
DESCRIPTION = "A library providing XDG parsers and other support methods and classes \
for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-xdg-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2c8a01411f8a7766c0d510346032f55be4b4d73d5fa8b7e23a1dc9bcb7a480b5233193ccfefac4e71c05d8faf848005e06562fbc2539b4d4abe82a9e089a7700"

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
