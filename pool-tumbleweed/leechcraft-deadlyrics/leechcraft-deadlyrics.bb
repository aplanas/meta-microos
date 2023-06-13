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
leechcraft-deadlyrics(aarch-64) \
leechcraft-lyricsprovider \
libleechcraft_deadlyrics.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft \
leechcraft-http \
leechcraft-summaryrepresentation \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-network-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
