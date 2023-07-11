SUMMARY = "Qt 5 Network Library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Network5-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "277cb3e36a940a9e50c456e6a4192f5592e941ccbd36fc32de867cb7d34de9706678ddbadd51f7826c7df3fc0e0b69381f237eaee979a87c5c550d21e4c674f1"

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
