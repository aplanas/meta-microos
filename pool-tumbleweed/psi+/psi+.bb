SUMMARY = "Jabber client using Qt"
DESCRIPTION = "Psi is the premiere Instant Messaging application designed for \
GNU/Linux, Microsoft Windows, Apple Mac OS X. Built upon an open \
protocol named Jabber, Psi is a fast and lightweight messaging client \
that utilises the best in open source technologies. Psi contains all \
the features necessary to chat, with no bloated extras that slow your \
computer down."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-1.5.1615+0-3.2.aarch64.rpm"
RPM_HASH = "e1f44a3aaaa331f57f54b39468190ad9993cc2b1e86033fac94fe37a3a0bc21ef3ce36eb22daa5ddf9c6adf555de7b416a79824acd403c96eff189f128685c53"

RPROVIDES:${PN} += "psi+"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libqca-qt5.so.2 \
libqt5keychain.so.1 \
libstdc++.so.6 \
libusrsctp.so.2 \
libz.so.1 \
psi+-data"

inherit rpm
