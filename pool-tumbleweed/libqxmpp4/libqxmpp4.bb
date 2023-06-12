SUMMARY = "Qt XMPP Library"
DESCRIPTION = "QXmpp is a cross-platform C++ XMPP client library based on Qt and C++."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.3"

RPM_NAME = "libqxmpp4-1.5.3-1.3.aarch64.rpm"
RPM_HASH = "08dba79c5afa3bd9eebce3381de976695c7281a3475ae0b8052ddc61c18e1a4e51099175b6c8e1723c171b4d55de326cdd6b8c86c4a42d42a4fefc7e14b3baa7"

RPROVIDES:${PN} += "libQXmppOmemo.so.4()(64bit) \
libqxmpp-qt5-0 \
libqxmpp.so.4()(64bit) \
libqxmpp4 \
libqxmpp4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libomemo-c.so.0()(64bit) \
libqca-qt5.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
