SUMMARY = "LeechCraft VK.com Streaming Module"
DESCRIPTION = "This package provides a VK.com music streaming plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-touchstreams-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "8600ddf5c85b81592a9c10f719bc633a554457c2d6be28302590ff209a1541ac11278695debf76f213f2a2972e8f74526675a05bd11489c51c8571842ce79dca"

RPROVIDES:${PN} += "leechcraft-touchstreams \
libleechcraft-touchstreams.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-lmp \
leechcraft-musiczombie \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-svcauth-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
