SUMMARY = "XDG utility library for LeechCraft"
DESCRIPTION = "A library providing XDG parsers and other support methods and classes \
for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-xdg-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2c8a01411f8a7766c0d510346032f55be4b4d73d5fa8b7e23a1dc9bcb7a480b5233193ccfefac4e71c05d8faf848005e06562fbc2539b4d4abe82a9e089a7700"

RPROVIDES:${PN} += "libleechcraft-util-xdg-qt5-0_6_75 \
libleechcraft-util-xdg-qt5-0_6_75(aarch-64) \
libleechcraft-util-xdg-qt5.so.0.6.75()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
