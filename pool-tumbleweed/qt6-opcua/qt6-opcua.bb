SUMMARY = "Qt wrapper for existing OPC UA stacks"
DESCRIPTION = "Qt API to interact with OPC UA (Open Platform Communications Unified \
Architecture) on top of a 3rd party OPC UA stack."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-opcua-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d7ab1d9b4db18ffbaee2b3dc0af5335cc51dc4ce90cc1f055b0b517eda89d94e86dbdbf25aaf7edc53f583a5c4a1b64ba35acd9c69e6564eb8a2fa909b4d992f"

RPROVIDES:${PN} += "libopen62541-backend.so \
qt6-opcua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6OpcUa.so.6 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6"

inherit rpm
