SUMMARY = "LeechCraft TabsList Module"
DESCRIPTION = "This package provides a tabs list plugin for Leechcraft \
which can show the list of currently opened tabs \
and allows to navigate between them."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-tabslist-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "3156129fc31ace3a2a4144938dc465c87b1bb182ac9ef9d85daa38589f9678012ca035d898d7a07365280740e07a829260e12d15ab5b55ef60db398d5024c22a"

RPROVIDES:${PN} += "leechcraft-tabslist \
libleechcraft-tabslist.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
