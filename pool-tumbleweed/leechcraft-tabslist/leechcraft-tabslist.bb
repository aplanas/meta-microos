SUMMARY = "LeechCraft TabsList Module"
DESCRIPTION = "This package provides a tabs list plugin for Leechcraft \
which can show the list of currently opened tabs \
and allows to navigate between them."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-tabslist-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2345a2b9634776ed6a9b343015493150795d8ecb9d9308107d84ebc2172a4e92750b26e3dc32e9445d23f299d11b6d3eb4638e816618bf9b0201d4e137c7f827"

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
