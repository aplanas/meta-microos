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

RPM_NAME = "leechcraft-scroblibre-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "e4932add730a4df8d6800e9e76e9f229592867b2f399e40fc7b73a54f35dc74f2126a53c82da759b057fbde7e135928ffa45a75baec058701f45798738451df3"

RPROVIDES:${PN} += "leechcraft-scrobbler \
leechcraft-scroblibre \
libleechcraft-scroblibre.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
