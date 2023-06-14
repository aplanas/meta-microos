SUMMARY = "LeechCraft Poshuku file: scheme module"
DESCRIPTION = "This package provides file: scheme support for LeechCraft Poshuku, \
allowing to navigate local resources. \
FileScheme also supports 'downloading' files from there."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-poshuku-filescheme-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2b2aba42fac13360ead860ebc874d2be8b75ea93f683cef050eb545e9f3172269c509d3362054850a9d458af884c14cea5c0af961dbec75db38188e66b8ce154"

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
