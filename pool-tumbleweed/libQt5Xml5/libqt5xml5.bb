SUMMARY = "Qt 5 Xml Library"
DESCRIPTION = "The Qt XML module provides C++ implementations of the SAX and DOM \
standards for XML."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Xml5-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "a5977069dbe55710c8dc07f2a94563ee62dd5d2affa9db4e5d7824f0fef6bd6558c3eb01b4306edc46c053ff66962d93df7ade32d1049fb4dd22ed2ed399e421"

RPROVIDES:${PN} += "libQt5Xml.so.5 \
libQt5Xml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
