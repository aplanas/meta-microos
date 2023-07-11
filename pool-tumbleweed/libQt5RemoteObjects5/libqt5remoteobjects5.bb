SUMMARY = "Qt 5 RemoteObjects Library"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5RemoteObjects5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "23bbbdadacbcbc410190ae0336411eb077ba77ca01c26e30cb8c058a54adab70823ca6b8f7a3bbb19f7d1218849a58dd37c55fc7b5cb036bd7a72503479d9505"

RPROVIDES:${PN} += "libQt5RemoteObjects.so.5 \
libQt5RemoteObjects5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
