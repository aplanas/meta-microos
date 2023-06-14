SUMMARY = "LeechCraft LMP MusicBrainz.org client Module"
DESCRIPTION = "This package provides a MusicBrainz.org client plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-musiczombie-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "ddff9da4c1f8188087b478fa347903e8baf5697403c8c90328647a4d0be46609a5164ed55395ce77f852442fca17bf89187a90895b1baee27d51c6457af9e718"

RPROVIDES:${PN} += "leechcraft-musiczombie \
libleechcraft-musiczombie.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libavcodec.so.58.134 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libchromaprint.so.1 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
