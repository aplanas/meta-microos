SUMMARY = "LeechCraft Pinned tabs Module"
DESCRIPTION = "This package provides a pinning tab module for LeechCraft with which \
it is possible to pin important tabs so that they occupy less space."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-pintab-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "f336217e35356830a1abceb20af4ffd0f372a55897ef54ffb86a3b324d77bf2c7434fe7133eeb465c77b7e28e37230a56be3e296d4846eba2835f286e98576ac"

RPROVIDES:${PN} += "leechcraft-pintab \
libleechcraft-pintab.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
