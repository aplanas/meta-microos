SUMMARY = "Qt6 PacketProtocol static library"
DESCRIPTION = "The Qt6 PacketProtocol static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-packetprotocol-devel-static-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "b13b7ca562f1c7ee058440b46186aa2711d0b1e81efcc668919ead7f0b2d0109892f1ec816de6a2a021dd90cc210dc585377a101c5bc9b706a3506207f490596"

RPROVIDES:${PN} += "cmake-Qt6PacketProtocolPrivate \
qt6-packetprotocol-devel-static \
qt6-packetprotocol-private-devel"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
