SUMMARY = "Qt 6 QmlCore library"
DESCRIPTION = "The Qt 6 QmlCore library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QmlCore6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "15bed522770fd31d9c803ad6910b3ea2a4c536be926e88f05a363ecee9694d885a6468ce76d8e88d3839596c38296a58d1944d4a0dd4e6a79ac8c37b6791ff07"

RPROVIDES:${PN} += "libQt6QmlCore.so.6 \
libQt6QmlCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
