SUMMARY = "Backends used to handle secure connections"
DESCRIPTION = "TLS (and non-TLS) plugins used by the QSsl classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-network-tls-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4ca163b259406f24d00656fc0e964d9f91c26ad978a068a01cbdd7a77595c8414d7e839f750c5fd0893e5365fe1a8284163052827f93ef15e9ce01d5ccdc63c2"

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
