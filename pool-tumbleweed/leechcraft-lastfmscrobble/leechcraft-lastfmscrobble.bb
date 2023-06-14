SUMMARY = "LeechCraft Last.FM Scrobble Module"
DESCRIPTION = "This package contains the LastFMScrobble plugin for LeechCraft \
which supports the Last.FM service. For example, it scrobbles tracks \
from other players, requests similar artists (on demand by other players as \
well), supports fetching album art, etc. \
 \
Features: \
 * Scrobbling listened tracks from other players like LMP to Last.FM. \
 * 'Loving' listened tracks. \
 * Support for requesting artists that are similar to a given artist. \
 * Automatic fetching of album art. \
 * Support for Last.FM radio. \
 * Fetching personalized recommendations. \
 * Fetching recent releases of artists that are in the user's collection. \
 * Fetching artists biography. \
 * Configurable language of the fetched information."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lastfmscrobble-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "fab0fede0718534535f21977e1a8b188ace8063d7b7923cf8a1fb5874dd0e224e508773dff0457aba6c6209fd0dff3d143161a9eee5aae14e822afef36dc75e5"

RPROVIDES:${PN} += "leechcraft-lastfmscrobble \
leechcraft-scrobbler \
libleechcraft-lastfmscrobble.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblastfm5.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
