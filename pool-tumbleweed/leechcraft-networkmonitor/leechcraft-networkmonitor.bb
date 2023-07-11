SUMMARY = "LeechCraft Network Monitor Module"
DESCRIPTION = "This package provides a network monitor plugin for LeechCraft. \
 \
It allows to watch for HTTP requests and allows to inspect them and search \
through the list."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-networkmonitor-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "6ba4fdcda67f1fa8fc56e4474b0c8f1fb1cfee6d59c50e889f2a66a19c7a9176363ab160b85e79777d546d615b3d40a4c971c404a5420fa684fd03a8e8c8d09e"

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
