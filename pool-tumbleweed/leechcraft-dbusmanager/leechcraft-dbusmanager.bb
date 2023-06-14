SUMMARY = "LeechCraft D-Bus Module"
DESCRIPTION = "This package provides a D-Bus implementation plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-dbusmanager-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "c1ca311ebf13ed5be4eb7c724b031eb3cd870337ff8ee45c478a5f456377c1b60428e7fb4553e806527c74e4d057bddd134fb56d6de2b086cfb16adc5f939745"

RPROVIDES:${PN} += "leechcraft-dbusmanager \
libleechcraft-dbusmanager.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
