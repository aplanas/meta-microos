SUMMARY = "Backends used to handle secure connections"
DESCRIPTION = "TLS (and non-TLS) plugins used by the QSsl classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-network-tls-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "332413ed4932fb3bfb2c4fb8e14a824a2a312984ec2b6c27622172d17cbe9f925fb3035ccc671b311427f00fd81c6b732a74ea228a2b1ff5a2356400d3cf4bb5"

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
