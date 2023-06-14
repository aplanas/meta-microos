SUMMARY = "LeechCraft Network Monitor Module"
DESCRIPTION = "This package provides a network monitor plugin for LeechCraft. \
 \
It allows to watch for HTTP requests and allows to inspect them and search \
through the list."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-networkmonitor-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "235e33de82bab607db6afc8fb84b16de7b0a038b977e5737e88c299ed9afc2df01717e4e951cf5871ec2a54730a0722affdcc1a4f65ef3a12740503e296c505f"

RPROVIDES:${PN} += "leechcraft-networkmonitor \
libleechcraft-networkmonitor.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
