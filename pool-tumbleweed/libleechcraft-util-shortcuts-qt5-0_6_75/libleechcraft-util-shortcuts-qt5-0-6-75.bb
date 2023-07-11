SUMMARY = "Shortcut utility library for LeechCraft"
DESCRIPTION = "A library easing shortcut usage in LeechCraft, particularly the \
configurable shortcuts subsystem."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-shortcuts-qt5-0_6_75-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "7aff75e567ed17f8b4f008636ea3c8e59d9f35df46cdb5cf0aecebc2ad5429913cba3ca8f3ae6f8087154805a20fe05576d4cb417ed857b84d6de9f4717b16e6"

RPROVIDES:${PN} += "libleechcraft-util-shortcuts-qt5-0-6-75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
