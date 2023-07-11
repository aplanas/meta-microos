SUMMARY = "LeechCraft Lyrics finder Module"
DESCRIPTION = "This package provides a lyrics finder plugin for LeechCraft. \
 \
It is a simple client for searching song lyrics on various sites. \
The search interface is available via LeechCraft Summary."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-deadlyrics-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "6f0213b046831235202c3ed38a8a2c512e4783dde469c883da1160049617bff3db22acbbacf5b60ecf62803c6de66352de48a0fbd643d47922452a07031cf9d8"

RPROVIDES:${PN} += "leechcraft-deadlyrics \
leechcraft-lyricsprovider \
libleechcraft-deadlyrics.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
leechcraft-summaryrepresentation \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libstdc++.so.6"

inherit rpm
