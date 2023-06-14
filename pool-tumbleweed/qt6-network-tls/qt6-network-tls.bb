SUMMARY = "Backends used to handle secure connections"
DESCRIPTION = "TLS (and non-TLS) plugins used by the QSsl classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-network-tls-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6656691ddff3dbed77ce0b966fd0ceadda1b1667300b66f9f6caab11ca0584bceef51225d88752c570a503099d56340f2b948cca5e0693347e680a703dc0a6af"

RPROVIDES:${PN} += "libqcertonlybackend.so \
libqopensslbackend.so \
qt6-network-tls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
