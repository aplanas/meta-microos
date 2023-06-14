SUMMARY = "PostScript support for LeechCraft Monocle"
DESCRIPTION = "This package contains the PostRus subplugin for LeechCraft Monocle \
which supports PostScript document support via the ghostscript utilities."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-postrus-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "78b457684563ae909235543e3e4e5087d378870fdcad55860a67fa2a6ee2e47e6638ed27790e4bfe68513829e46506b8e27e8d73686c7d2c4d6b45fe601aac5f"

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
