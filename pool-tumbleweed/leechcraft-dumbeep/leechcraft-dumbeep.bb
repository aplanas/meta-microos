SUMMARY = "LeechCraft DumBeep Module"
DESCRIPTION = "This package provides a dumb sound notifier plugin for LeechCraft. \
 \
It uses Phonon as a backend, or something like aplay/mplayer."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-dumbeep-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2d68d3ae6b1f282152d2ccbf19f4439d8fb2b70f1cd311cc9024566dcd99e476a487c827d40f2be036f46a5557d6b780fd44ecf257fe1725c23957cdd23e4b29"

RPROVIDES:${PN} += "leechcraft-dumbeep \
leechcraft-soundnotifications \
libleechcraft-dumbeep.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
