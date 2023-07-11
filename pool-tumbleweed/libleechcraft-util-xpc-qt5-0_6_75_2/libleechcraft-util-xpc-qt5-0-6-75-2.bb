SUMMARY = "Cross-plugin communication utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used primitives for \
communications between different plugins in LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-xpc-qt5-0_6_75_2-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "2d0ce6a9727f7301e992ef19261da3da77807be1d3fc54a42712cf1f5e6f24662df7857938b799373ef3186476c939eb4248f0c882c6d91a551b0373263458ce"

RPROVIDES:${PN} += "libleechcraft-util-xpc-qt5-0-6-75-2 \
libleechcraft-util-xpc-qt5.so.0.6.75.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
