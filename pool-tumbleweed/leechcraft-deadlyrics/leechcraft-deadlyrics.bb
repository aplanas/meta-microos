SUMMARY = "LeechCraft Lyrics finder Module"
DESCRIPTION = "This package provides a lyrics finder plugin for LeechCraft. \
 \
It is a simple client for searching song lyrics on various sites. \
The search interface is available via LeechCraft Summary."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-deadlyrics-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "251956ef871b0d3464e3bc6fa24031de554fab9f3980aa94df97f3c9f0b7ce9c1200f6541ffe181d4ced629bd9cd009b05223cce7a32bfceec804a722894d792"

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
