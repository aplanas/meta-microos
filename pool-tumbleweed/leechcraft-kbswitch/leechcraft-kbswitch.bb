SUMMARY = "LeechCraft keyboard switcher Module"
DESCRIPTION = "This module allows changing keyboard layouts from LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-kbswitch-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "277dc5ec42099b24dd3fb044de4bc84c310ff41f6d642fbee79c27a76e1523d80dc306c823851c1f408db7e5e461912c2744a9620c68e08647c83419fe6afcee"

RPROVIDES:${PN} += "leechcraft-kbswitch \
libleechcraft-kbswitch.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-x11-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbfile.so.1 \
qt5qmlimport-QtQuick.2 \
setxkbmap"

inherit rpm
