SUMMARY = "Qt6 PacketProtocol static library"
DESCRIPTION = "The Qt6 PacketProtocol static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-packetprotocol-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4684cc4c64cab181cf85d2b5fc549d0ee91d0a2744b3f4c33bbcb7550a6cf9e5da6cce8f18826be87708d0c15ca9a19eee5c3a3a2d19a439efd31a0e56822442"

RPROVIDES:${PN} += "cmake-Qt6PacketProtocolPrivate \
qt6-packetprotocol-devel-static \
qt6-packetprotocol-private-devel"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
