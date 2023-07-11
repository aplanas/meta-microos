SUMMARY = "Qt 5 Test Library"
DESCRIPTION = "Qt Test is a framework for unit testing Qt based applications and \
libraries. Qt Test provides functionality commonly found in unit \
testing frameworks as well as extensions for testing graphical user \
interfaces."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Test5-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "1b5cec3484289da16c1772601fe1a4d38f661901ac629986ff8c57c19ab3edb5683c6cce738e37c272b9f777a9a679547b9367f52409d8c7400274c487ec6e38"

RPROVIDES:${PN} += "libQt5Test.so.5 \
libQt5Test5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
