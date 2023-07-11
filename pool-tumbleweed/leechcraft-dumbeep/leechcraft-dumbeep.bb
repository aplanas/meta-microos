SUMMARY = "LeechCraft DumBeep Module"
DESCRIPTION = "This package provides a dumb sound notifier plugin for LeechCraft. \
 \
It uses Phonon as a backend, or something like aplay/mplayer."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-dumbeep-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "3cd6e4a2a840384f539f266e03e88a079e36a8900953f513fcd805cac04485b4c28d723a71375e093127f4757bde54d2bbe739fdd0aa136ad951d7803f8ea097"

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
