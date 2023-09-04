SUMMARY = "Qt6 QmlDebug static library"
DESCRIPTION = "The Qt6 QmlDebug static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmldebug-devel-static-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "4762d40a3ff9d24a989629af42a756a9e9685481ed01e0a1a34011c84208d7e4e600b92f8635b88155ec4ecd1897c6b65d8fec9962b37400d10a5747436ba42d"

RPROVIDES:${PN} += "cmake-Qt6QmlDebugPrivate \
qt6-qmldebug-devel-static \
qt6-qmldebug-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
qt6-core-private-devel \
qt6-packetprotocol-devel-static \
qt6-qml-private-devel"

inherit rpm
