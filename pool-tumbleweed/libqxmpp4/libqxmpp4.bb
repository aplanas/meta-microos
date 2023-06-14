SUMMARY = "Qt XMPP Library"
DESCRIPTION = "QXmpp is a cross-platform C++ XMPP client library based on Qt and C++."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.3"

RPM_NAME = "libqxmpp4-1.5.3-1.3.aarch64.rpm"
RPM_HASH = "08dba79c5afa3bd9eebce3381de976695c7281a3475ae0b8052ddc61c18e1a4e51099175b6c8e1723c171b4d55de326cdd6b8c86c4a42d42a4fefc7e14b3baa7"

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
