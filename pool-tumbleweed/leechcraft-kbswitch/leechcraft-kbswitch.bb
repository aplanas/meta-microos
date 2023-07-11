SUMMARY = "LeechCraft keyboard switcher Module"
DESCRIPTION = "This module allows changing keyboard layouts from LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-kbswitch-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "8e80fd82ed2eae4c8705a3c7b1a747f12ca1cbb5c8c462fb2d8c05802ded6819e1f2928c1cd09957575e6f9793e519ebf7a0757841b1938146dfa7b69970d459"

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
