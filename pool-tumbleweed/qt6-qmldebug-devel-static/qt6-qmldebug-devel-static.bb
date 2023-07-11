SUMMARY = "Qt6 QmlDebug static library"
DESCRIPTION = "The Qt6 QmlDebug static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmldebug-devel-static-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "d2c5d6d3b1fee5666769c0732dd402782ab13b28f22f78bf2c7faeb8c565ec2a7fe9ed04cadc311548e7a386db02692be1a71fe9c86f4c1d33f0740df775bb69"

RPROVIDES:${PN} += "cmake-Qt6QmlDebugPrivate \
qt6-qmldebug-devel-static \
qt6-qmldebug-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Network \
qt6-core-private-devel \
qt6-packetprotocol-devel-static \
qt6-qml-private-devel"

inherit rpm
