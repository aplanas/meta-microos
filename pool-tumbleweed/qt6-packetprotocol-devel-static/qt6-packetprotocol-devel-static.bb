SUMMARY = "Qt6 PacketProtocol static library"
DESCRIPTION = "The Qt6 PacketProtocol static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-packetprotocol-devel-static-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "0571de4aad4812978d20a174330c31aceef2a8cb2fa99a8e01983cedd4e5ea41bff2b0e9be772fe6d64790d055f4ec56a1c17caceaefc1d5afb5c645bee706f5"

RPROVIDES:${PN} += "cmake-Qt6PacketProtocolPrivate \
qt6-packetprotocol-devel-static \
qt6-packetprotocol-private-devel"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
