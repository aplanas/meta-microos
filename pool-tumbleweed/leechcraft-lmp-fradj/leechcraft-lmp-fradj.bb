SUMMARY = "LeechCraft Equalizer Module"
DESCRIPTION = "This package provides a 10-band equalizer."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-fradj-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "7e877ba96c6623b031b5c23cfe4a88bb21673276d8c27921b601e65684db555d318055e1d72662471acaec513684baf32a5e08d99f534f7d03413711915c6775"

RPROVIDES:${PN} += "leechcraft-lmp-fradj \
libleechcraft-lmp-fradj.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libleechcraft-util-qt5.so.0.6.75 \
libqwt-qt5.so.6.2 \
libstdc++.so.6"

inherit rpm
