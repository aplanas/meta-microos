SUMMARY = "FictionBook support for LeechCraft Monocle"
DESCRIPTION = "This package contains the FictionBook subplugin for LeechCraft Monocle."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-monocle-fxb-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "1713893fa5fd42533582908b3983ca6fdbd22fb545d9b82652a98449919630ef79d74e110e8a9c7ad633a542c1c632eb2bc9b06bdb80b3ef7214b61783ca9626"

RPROVIDES:${PN} += "leechcraft-monocle-fxb \
leechcraft-monocle-subplugin \
libleechcraft-monocle-fxb.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-monocle.so \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
