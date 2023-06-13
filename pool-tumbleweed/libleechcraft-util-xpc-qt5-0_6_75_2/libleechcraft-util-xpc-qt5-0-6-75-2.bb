SUMMARY = "Cross-plugin communication utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used primitives for \
communications between different plugins in LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-xpc-qt5-0_6_75_2-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "53cbc9914d75206de6e2fb14df3d2f20f8762d7fa3942e8b0e96aba80e2fbb93d8f82b3a570b56b557c3064fb7e54260e288b66384d44dcdccda6c4f8f36e024"

RPROVIDES:${PN} += "libleechcraft-util-xpc-qt5-0_6_75_2 \
libleechcraft-util-xpc-qt5-0_6_75_2(aarch-64) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
