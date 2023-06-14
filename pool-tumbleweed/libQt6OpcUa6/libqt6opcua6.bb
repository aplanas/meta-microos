SUMMARY = "Qt 6 OpcUa Client Library"
DESCRIPTION = "Qt 6 OpcUa Client Library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6OpcUa6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1549347e39d4102b5d4651bc01c0b7f6487976d7096861273c74698cce9cdc8bbf5ab4b17295de9644814d498fafd64ecab3d233ba9588d292905c3daf9db9d1"

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
