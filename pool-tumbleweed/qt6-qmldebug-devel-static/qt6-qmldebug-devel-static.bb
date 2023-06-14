SUMMARY = "Qt6 QmlDebug static library"
DESCRIPTION = "The Qt6 QmlDebug static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmldebug-devel-static-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "72caf0b8954197b7d67238c3da4237628ce01f84c2d870301880fcbdeaef166f88fcde34f2e2d9fabc440b5c21cf1d4b19807ab83e0bea4e79127e233414dda1"

RPROVIDES:${PN} += "cmake-Qt6QmlDebugPrivate \
qt6-qmldebug-devel-static \
qt6-qmldebug-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
qt6-core-private-devel \
qt6-packetprotocol-devel-static \
qt6-qml-private-devel"

inherit rpm
