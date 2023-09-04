SUMMARY = "Qt 6 Network library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Network6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "6fa64b2379a955160f94f304d34b2f93fad6a254a16607b84f3215e16df51d3797f4d9dc004e27dcb37c834dd69d71de6dc26c3aebb03a197ff177199afdce87"

RPROVIDES:${PN} += "libQt6Network.so.6 \
libQt6Network6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libQt6DBus6 \
libbrotlidec.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libproxy.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
qt6-network-tls"

inherit rpm
