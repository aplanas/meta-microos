SUMMARY = "Backends used to handle secure connections"
DESCRIPTION = "TLS (and non-TLS) plugins used by the QSsl classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-network-tls-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6656691ddff3dbed77ce0b966fd0ceadda1b1667300b66f9f6caab11ca0584bceef51225d88752c570a503099d56340f2b948cca5e0693347e680a703dc0a6af"

RPROVIDES:${PN} += "libqcertonlybackend.so()(64bit) \
libqcertonlybackend.so(Qt_6)(64bit) \
libqcertonlybackend.so(Qt_6.0)(64bit) \
libqcertonlybackend.so(Qt_6.1)(64bit) \
libqcertonlybackend.so(Qt_6.2)(64bit) \
libqcertonlybackend.so(Qt_6.3)(64bit) \
libqcertonlybackend.so(Qt_6.4)(64bit) \
libqcertonlybackend.so(Qt_6.5)(64bit) \
libqcertonlybackend.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqopensslbackend.so()(64bit) \
libqopensslbackend.so(Qt_6)(64bit) \
libqopensslbackend.so(Qt_6.0)(64bit) \
libqopensslbackend.so(Qt_6.1)(64bit) \
libqopensslbackend.so(Qt_6.2)(64bit) \
libqopensslbackend.so(Qt_6.3)(64bit) \
libqopensslbackend.so(Qt_6.4)(64bit) \
libqopensslbackend.so(Qt_6.5)(64bit) \
libqopensslbackend.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-network-tls \
qt6-network-tls(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Network.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
