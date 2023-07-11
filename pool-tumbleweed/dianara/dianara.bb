SUMMARY = "Pump.io social network desktop client"
DESCRIPTION = "Dianara is a client for pump.io (and GNU MediaGoblin), a desktop \
application for GNU/Linux that allows users to manage their pump.io \
social networking accounts without the need to use a web browser. \
You can read your timelines, post messages and pictures, and manage \
your contacts."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "dianara-1.4.4-1.4.aarch64.rpm"
RPM_HASH = "d50d95f880aa8718bfd26f5922b32536ebb1baa95f88c13f6a03e896b31456233c22c52a24141dc3370e04c2a2488e048bced29815a3257f559526f1de938e54"

RPROVIDES:${PN} += "dianara"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqca-qt5.so.2 \
libqoauth.so.2 \
libstdc++.so.6"

inherit rpm
