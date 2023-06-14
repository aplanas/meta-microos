SUMMARY = "LeechCraft Poshuku URL Keyword Support Module"
DESCRIPTION = "This package provides an LeechCraft Poshuku module for URL keywords."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-keywords-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "dc514d1aff9155a8017e52af12dcedb72c29cd75d32c40c2b2ccf76c0751b1d9b54edffddd254148cc501f5f252ccf19298bad06fe02cc21b880e9874639f9e9"

RPROVIDES:${PN} += "leechcraft-poshuku-keywords \
libleechcraft-poshuku-keywords.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
