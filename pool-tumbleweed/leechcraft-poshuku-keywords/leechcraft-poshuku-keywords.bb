SUMMARY = "LeechCraft Poshuku URL Keyword Support Module"
DESCRIPTION = "This package provides an LeechCraft Poshuku module for URL keywords."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-keywords-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "1df2b0da4831615b722dcb95d1597a93853809dc62548ed570a80b0fd84497d51abc061d1f36e79185ae5dc58515d1f0a5b4e8ca7ee01154c7dd107122026f9d"

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
