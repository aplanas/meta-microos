SUMMARY = "Qt XMPP Library"
DESCRIPTION = "QXmpp is a cross-platform C++ XMPP client library based on Qt and C++."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.3"

RPM_NAME = "libqxmpp4-1.5.3-1.4.aarch64.rpm"
RPM_HASH = "e00f72422d021f366f2bb6c777d5bf9d5c7bbb11a2224a21151eb70a3f3bd938257dc3f6723d2371642ff28198cf684463700d47a26fe3ff30fd797809d588c7"

RPROVIDES:${PN} += "libQXmppOmemo.so.4 \
libqxmpp-qt5-0 \
libqxmpp.so.4 \
libqxmpp4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libomemo-c.so.0 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
