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
leechcraft-poshuku-cleanweb(aarch-64) \
libleechcraft_poshuku_cleanweb.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-poshuku \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
