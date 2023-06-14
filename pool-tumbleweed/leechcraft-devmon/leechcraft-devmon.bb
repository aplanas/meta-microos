SUMMARY = "LeechCraft Device Monitor Module"
DESCRIPTION = "This package provides a devices monitor plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-devmon-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "7c8cabf91dec5447d3e25b3709d475e9748643ce0dee315f61a96c62588e4a1528a5e61c8fe57de5462f232a1790111bd04d7f8fa8ca846eb2949190f0434f02"

RPROVIDES:${PN} += "leechcraft-devmon \
libleechcraft-devmon.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
