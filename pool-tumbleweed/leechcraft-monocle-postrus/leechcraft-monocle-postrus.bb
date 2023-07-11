SUMMARY = "PostScript support for LeechCraft Monocle"
DESCRIPTION = "This package contains the PostRus subplugin for LeechCraft Monocle \
which supports PostScript document support via the ghostscript utilities."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-postrus-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "b4b0c71f8f846dc86d761e9284c874820c9dc02271bc880463b4990621a0701643174a4bc432e178d9f56917ae43e345a12cfcd85048590a2e7f749d42d53889"

RPROVIDES:${PN} += "leechcraft-monocle-postrus \
leechcraft-monocle-subplugin \
libleechcraft-monocle-postrus.so"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1 \
leechcraft-monocle-pdf \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
