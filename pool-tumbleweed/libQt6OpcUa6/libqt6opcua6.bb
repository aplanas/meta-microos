SUMMARY = "Qt 6 OpcUa Client Library"
DESCRIPTION = "Qt 6 OpcUa Client Library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6OpcUa6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d90017aa11ac55ec4047e6970ece16c54905fd82c8a713bb865458f88aed20161176a6cc16b3bfb6f25537d4a91506aa17f4c5c52be666ba0b931d15d10f093a"

RPROVIDES:${PN} += "libQt6OpcUa.so.6 \
libQt6OpcUa6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6"

inherit rpm
