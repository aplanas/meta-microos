SUMMARY = "Qt 6 Network library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Network6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "3f2c674a37feba0540d22c69584923e7d5875d2e6a8f9074600b742b065b6f4038f2fe2192ac517aae37c30d781ed3ee3cec4516a3880fc6b412efaf7d7f8f25"

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
