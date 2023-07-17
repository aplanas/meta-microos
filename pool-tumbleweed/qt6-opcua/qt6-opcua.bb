SUMMARY = "Qt wrapper for existing OPC UA stacks"
DESCRIPTION = "Qt API to interact with OPC UA (Open Platform Communications Unified \
Architecture) on top of a 3rd party OPC UA stack."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "50e3749f48403f74c4559017e9657dc64feb764d9d13d02bd1b40c3dcea6053bc8520e82334f4eb4dd0282839374e1354c5d354e0f543149553bec65302fcdda"

RPROVIDES:${PN} += "libopen62541-backend.so \
qt6-opcua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6OpcUa.so.6 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6"

inherit rpm
