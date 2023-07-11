SUMMARY = "LeechCraft Screenshooter Module"
DESCRIPTION = "This package provides a LeechCraft plugin to make screenshots of \
LeechCraft and then either save them locally or upload them to an \
imagebin."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-auscrie-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "48745bf1dfbbd7b7205800fa9bfce964607f40d354b1fd0da9c7366618c45dc348d4d7c9078c706de4d5d488c1f15d59de7f3e07408e42938389c1b73a706ffe"

RPROVIDES:${PN} += "leechcraft-auscrie \
libleechcraft-auscrie.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-imgaste \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
