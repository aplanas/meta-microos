SUMMARY = "LeechCraft Security manager Module"
DESCRIPTION = "This package provides a security manager plugin for LeechCraft. \
 \
It is the base module for secure storage. \
Particular storage backends are implemented by subplugins."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-secman-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "697607fd6515808602f878bf4187350f9c2373b2a5e3f9fa81095f2816eb73a4c2907451a207ab472d5009694d8635bf38930f646c2eff6dc9b789e54d407f77"

RPROVIDES:${PN} += "leechcraft-secman \
leechcraft-securestorage \
libleechcraft-secman.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-secman-simplestorage \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
