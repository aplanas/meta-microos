SUMMARY = "LeechCraft Submissions Protocol Scrobble Module"
DESCRIPTION = "This package contains a Scroblibre plugin for LeechCraft. \
 \
It is an implementation of the submissions protocol 1.2 with \
support ( http://www.audioscrobbler.net/development/protocol ) \
for sites other than last.fm (libre.fm for now). It can \
potentially handle arbitrary scrobbling URLs implementing the \
submissions protocol, but it is not exposed in the GUI (yet). \
 \
Scroblibre is a supplement for the LastFMScrobble module, and the \
latter is still the recommended one because of all the social \
features it offers which Scroblibre lacks."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-scroblibre-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "5fc0caedc6845a2d5516c9dce18d1f9d66be22674f242dd050859069b057254824fd4eedabc1b8522aaeb879f029d775e53803b6680343121251237862bcf9c8"

RPROVIDES:${PN} += "leechcraft-scrobbler \
leechcraft-scroblibre \
leechcraft-scroblibre(aarch-64) \
libleechcraft_scroblibre.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft-lmp \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
