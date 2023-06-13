SUMMARY = "Qt 5 Network Library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Network5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "ba1c9693882a0a1bc6e2c19932bed32c8d1141a8a342da27f112143d02692da2bfe9fc567f5f7ec9b27680d645da0a2fbb0e5695dbf106eb473c938ddc9c1fe2"

RPROVIDES:${PN} += "libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Network.so.5(Qt_5.0)(64bit) \
libQt5Network.so.5(Qt_5.1)(64bit) \
libQt5Network.so.5(Qt_5.10)(64bit) \
libQt5Network.so.5(Qt_5.11)(64bit) \
libQt5Network.so.5(Qt_5.12)(64bit) \
libQt5Network.so.5(Qt_5.13)(64bit) \
libQt5Network.so.5(Qt_5.14)(64bit) \
libQt5Network.so.5(Qt_5.15)(64bit) \
libQt5Network.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Network.so.5(Qt_5.2)(64bit) \
libQt5Network.so.5(Qt_5.3)(64bit) \
libQt5Network.so.5(Qt_5.4)(64bit) \
libQt5Network.so.5(Qt_5.5)(64bit) \
libQt5Network.so.5(Qt_5.6)(64bit) \
libQt5Network.so.5(Qt_5.7)(64bit) \
libQt5Network.so.5(Qt_5.8)(64bit) \
libQt5Network.so.5(Qt_5.9)(64bit) \
libQt5Network5 \
libQt5Network5(aarch-64) \
libqconnmanbearer.so()(64bit) \
libqgenericbearer.so()(64bit) \
libqnmbearer.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5DBus5 \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libproxy.so.1()(64bit) \
libproxy.so.1(LIBPROXY_0.4.16)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libz.so.1()(64bit)"

inherit rpm
