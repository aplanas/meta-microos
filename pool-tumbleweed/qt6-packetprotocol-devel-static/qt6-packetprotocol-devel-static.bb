SUMMARY = "Qt6 PacketProtocol static library"
DESCRIPTION = "The Qt6 PacketProtocol static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-packetprotocol-devel-static-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "aa0cce99285e4403f64a4fe7c817e1de44440daf790fd97e992aaf35785cab790055838ff6e72dcf83dd961d0545f9cbc5746b95e67c44d09460d58e66a6a170"

RPROVIDES:${PN} += "cmake-Qt6PacketProtocolPrivate \
qt6-packetprotocol-devel-static \
qt6-packetprotocol-private-devel"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
