SUMMARY = "LeechCraft Equalizer Module"
DESCRIPTION = "This package provides a 10-band equalizer."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-fradj-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "e5edfcc8064abe020274bf487b67c9c4660c23bb75c7b08871ab452c0f12b04c319953736d41a5822eacbc49627f282e16910e0f749b3fc680806e6ceb0f94cf"

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
