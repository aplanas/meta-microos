SUMMARY = "LeechCraft LMP MusicBrainz.org client Module"
DESCRIPTION = "This package provides a MusicBrainz.org client plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-musiczombie-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "c34c088df456aeb0cf5a6607f63d738d41e7a31107bf6811306aca9b06fccef065cd42256f38b864307564c5cbc03cbc1bb6e8e86fc90c6c8d20593a68c53e0c"

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
