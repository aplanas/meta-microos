SUMMARY = "Qt 6 OpcUa Client Library"
DESCRIPTION = "Qt 6 OpcUa Client Library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6OpcUa6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "66b3d0502ac2647504d9010d478e0ec1252396f83d7fc80ec2413f08a0f6cb7dbc82b7869a6f104ce71ddc6bd2d18aeae7f45f9511101629939baf254d3bcdbf"

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
