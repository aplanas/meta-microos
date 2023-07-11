SUMMARY = "LeechCraft HTTP Module"
DESCRIPTION = "This package provides a HTTP implementation plugin for LeechCraft \
which will mainly used by many other plugins like Aggregator or \
SeekThru. \
 \
Features: \
 * Support for redirects. \
 * Automatic downloads from other plugins. \
 * Support for continuing interrupted downloads."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-cstp-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "8cd0c1eb9700427c4ccd79fed4b61b44b7c37831feb0ee77e063a86839b986ab29e2ef4478f87eec7a73aaadf2b69f480d6eb7b166d8edfca54fb2fc071d882a"

RPROVIDES:${PN} += "leechcraft-cstp \
leechcraft-http \
libleechcraft-cstp.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
