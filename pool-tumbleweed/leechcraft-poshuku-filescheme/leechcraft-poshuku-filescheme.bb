SUMMARY = "LeechCraft Poshuku file: scheme module"
DESCRIPTION = "This package provides file: scheme support for LeechCraft Poshuku, \
allowing to navigate local resources. \
FileScheme also supports 'downloading' files from there."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-filescheme-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "6a8115d5197b273070975c23f50a3eb76f83647a60c0741c48b032f67ec54a5884b609655bed2f62fe543e7d774f2e327ee6eee868598ee307640a5f6103d67c"

RPROVIDES:${PN} += "leechcraft-poshuku-filescheme \
libleechcraft-poshuku-filescheme.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libstdc++.so.6"

inherit rpm
