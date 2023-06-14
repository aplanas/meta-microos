SUMMARY = "LeechCraft Azoth libpurple Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which \
makes the various protocols supported by libpurple available \
in Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-velvetbird-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "276fc65ce153e99ea14b753cd6385206d2d17bfcd3393a5b4575fa9a42df31fbb5cda55e0ac121265575ab55ffbb9c1c971e2d0ba154373d5b65204ec3c90b25"

RPROVIDES:${PN} += "leechcraft-azoth-protocolplugin \
leechcraft-azoth-velvetbird \
libleechcraft-azoth-velvetbird.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libpurple.so.0 \
libstdc++.so.6"

inherit rpm
