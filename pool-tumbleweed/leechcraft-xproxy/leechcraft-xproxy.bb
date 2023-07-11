SUMMARY = "LeechCraft Proxy manager Module"
DESCRIPTION = "This package provides an advanced proxy manager for LeechCraft \
with which you can configure and use proxy servers."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-xproxy-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "812c4282aa2c29f497970d68f8ce6e829e4bb28a9a8a48c72d9413251078c169419d6af57fa8f96596cbb1ebce79c491d77e8d80f1d5d8017c8a7ce257dea98a"

RPROVIDES:${PN} += "leechcraft-xproxy \
libleechcraft-xproxy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
