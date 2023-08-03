SUMMARY = "Qt6 QmlDebug static library"
DESCRIPTION = "The Qt6 QmlDebug static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmldebug-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "36b6f8fb0473720e78d8d776c9cf7b5b663e163a8aa471cbb0a7b7e73032ba5446fcbf2ca7e2b33fbdec8c57efcc744b7033bb33de4ca90974ded4e9df0fa7f2"

RPROVIDES:${PN} += "cmake-Qt6QmlDebugPrivate \
qt6-qmldebug-devel-static \
qt6-qmldebug-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
qt6-core-private-devel \
qt6-packetprotocol-devel-static \
qt6-qml-private-devel"

inherit rpm
