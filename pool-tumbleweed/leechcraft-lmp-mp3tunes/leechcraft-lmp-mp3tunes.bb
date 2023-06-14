SUMMARY = "LeechCraft mp3tunes.com Module"
DESCRIPTION = "This package provides a LeechCraft plugin to \
synchronizing with, and use the mp3tunes.com service. \
 \
Features: \
 * Using many accounts. \
 * Getting playlists."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-mp3tunes-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "027d6b3466e9a35b169418dfba3c574e2ebb326d3df11d61f534efa2102fbcbff26d9f6538bfd4fe53d0efedbc0736045020fde64b1f2d986fd874f8679101d4"

RPROVIDES:${PN} += "leechcraft-lmp-mp3tunes \
libleechcraft-lmp-mp3tunes.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
