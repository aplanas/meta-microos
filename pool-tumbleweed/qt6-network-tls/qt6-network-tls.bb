SUMMARY = "Backends used to handle secure connections"
DESCRIPTION = "TLS (and non-TLS) plugins used by the QSsl classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-network-tls-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "c48fa107069bfbf11ce7a18cab84499324ed6f4467e09555cbbecb98da20cc97f33b14820c2a7fc35510a9ca8fa33d7a28799a99792447c95ba12b2f4ac93634"

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
