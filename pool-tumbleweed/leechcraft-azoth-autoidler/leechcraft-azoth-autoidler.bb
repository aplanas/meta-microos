SUMMARY = "LeechCraft Azoth Module for automatic status change"
DESCRIPTION = "This package provides a LeechCraft Azoth plugin which can \
automatically change your status based on an inactivity period."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-autoidler-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "dbb0c78ff9aaf39edc2264d749f57c41df571997c6ea5b5f670e2509aa61d5ed11a35756491dfa007bd27cb6aa7990744eb95e7410fe4b74d6be21219209cff9"

RPROVIDES:${PN} += "leechcraft-azoth-autoidler \
libleechcraft-azoth-autoidler.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
