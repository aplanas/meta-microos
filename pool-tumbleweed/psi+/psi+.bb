SUMMARY = "Jabber client using Qt"
DESCRIPTION = "Psi is the premiere Instant Messaging application designed for \
GNU/Linux, Microsoft Windows, Apple Mac OS X. Built upon an open \
protocol named Jabber, Psi is a fast and lightweight messaging client \
that utilises the best in open source technologies. Psi contains all \
the features necessary to chat, with no bloated extras that slow your \
computer down."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-1.5.1615+0-3.1.aarch64.rpm"
RPM_HASH = "9eee668835bbb017f85e137ea09036222b494426436f7c54e8855c13630eaa0ba146d297d457392b3bdf94e1b588153e48c6aeb993fea2f439da117c920ad4c3"

RPROVIDES:${PN} += "application() \
application(psi-plus.desktop) \
metainfo() \
metainfo(psi-plus.appdata.xml) \
mimehandler(x-scheme-handler/xmpp) \
psi+ \
psi+(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5WebChannel.so.5()(64bit) \
libQt5WebChannel.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXss.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libm.so.6()(64bit) \
libqca-qt5.so.2()(64bit) \
libqt5keychain.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libusrsctp.so.2()(64bit) \
libz.so.1()(64bit) \
psi+-data"

inherit rpm
