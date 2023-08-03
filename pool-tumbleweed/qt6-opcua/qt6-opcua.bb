SUMMARY = "Qt wrapper for existing OPC UA stacks"
DESCRIPTION = "Qt API to interact with OPC UA (Open Platform Communications Unified \
Architecture) on top of a 3rd party OPC UA stack."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-opcua-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8845014578e42151f52165d9168b43e5fa67f2d0a3ef7f8f101ebef4026282e167eb6563edf0f4b420bdd2ac653100951de3984a384dcdf50d7532ff98a71de0"

RPROVIDES:${PN} += "libopen62541-backend.so \
qt6-opcua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6OpcUa.so.6 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6"

inherit rpm
