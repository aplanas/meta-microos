SUMMARY = "LeechCraft Tag Manipulating Module"
DESCRIPTION = "This package provides a tag editor plugin for LeechCraft \
with with audio file tags can be manipulated."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-graffiti-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b76f4f85f069bf3320d4b68bbdb27f8ce6abb4afa57c1e696b691e3bd852109b85f223564be3c533eff2bb18982ec5eafeb7a0f52f1881c7dfc61d041f45eb65"

RPROVIDES:${PN} += "leechcraft-lmp-graffiti \
libleechcraft-lmp-graffiti.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-tags-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libm.so.6 \
libstdc++.so.6 \
libtag.so.1"

inherit rpm
