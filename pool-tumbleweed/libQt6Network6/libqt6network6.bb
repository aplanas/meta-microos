SUMMARY = "Qt 6 Network library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Network6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2a3a5ad2bbbb108d29babb5c4e316696c295014a27ecfdb4a58839129eaed407f101a0536095bcedc0a774e1e7929f36b0b17970f8783b54eac1bb0106a673b1"

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
