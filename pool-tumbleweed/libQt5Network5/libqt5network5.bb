SUMMARY = "Qt 5 Network Library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Network5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "7748d3046e4216fd8369c60158e39ae1bee4d780a6abebaab189dfd2bbcfa28fcf4df4d93e800a45cbff7c7b3bbad1f1cdba3d170a253f1cee472dad7067703a"

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
