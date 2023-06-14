SUMMARY = "LeechCraft Poshuku Ad Filter Module"
DESCRIPTION = "This package provides an advertisement filter for LeechCraft Poshuku. \
 \
Features: \
 * Support for Firefox AdBlock+ block lists. \
 * Support for detection and subscription to such lists. \
 * Automatic updates of block lists. \
 * User filters: blocking arbitrary images. \
 * Support for replacing Adobe Flash objects with a 'Load flash' button. \
 * Whitelists for the Flash blocker."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-cleanweb-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "7056afc5ac4b84c00ed809c6bd75fc66105eaaef2e23f7f2138e3acbf9fda2081bf98665d97c42234aa8d80fca50080d5568cadfd0e5d2e26b3ae938e6f12fd9"

RPROVIDES:${PN} += "leechcraft-poshuku-cleanweb \
libleechcraft-poshuku-cleanweb.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
