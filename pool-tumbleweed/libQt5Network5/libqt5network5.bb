SUMMARY = "Qt 5 Network Library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Network5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "ba1c9693882a0a1bc6e2c19932bed32c8d1141a8a342da27f112143d02692da2bfe9fc567f5f7ec9b27680d645da0a2fbb0e5695dbf106eb473c938ddc9c1fe2"

RPROVIDES:${PN} += "libQt5Network.so.5 \
libQt5Network5 \
libqconnmanbearer.so \
libqgenericbearer.so \
libqnmbearer.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libc.so.6 \
libcrypto.so.3 \
libproxy.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
