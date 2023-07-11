SUMMARY = "GUI utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used GUI-related \
widgets, classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-gui-qt5-0_6_75_1-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "c52aaabd8800a25ba72b2a93b5dc96c0fd3e935fffc8be42292d596ebd32b986fad98e2f68e6590f6a82949255feb96004dcc41e7a29ee5edebfbb177592afaf"

RPROVIDES:${PN} += "libleechcraft-util-gui-qt5-0-6-75-1 \
libleechcraft-util-gui-qt5.so.0.6.75.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
