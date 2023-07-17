SUMMARY = "Qt6 QmlDebug static library"
DESCRIPTION = "The Qt6 QmlDebug static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmldebug-devel-static-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "d13697b18cca6c985c50e33139aa07e2791445afbf118f9aff5a292ed2e4215259102e8d36da45c120ec8a290a0befb2707f25a724794129baee40e8cce1b823"

RPROVIDES:${PN} += "cmake-Qt6QmlDebugPrivate \
qt6-qmldebug-devel-static \
qt6-qmldebug-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
qt6-core-private-devel \
qt6-packetprotocol-devel-static \
qt6-qml-private-devel"

inherit rpm
