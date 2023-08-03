SUMMARY = "Non-ABI stable API for the Qt 6 QmlModels library"
DESCRIPTION = "This package provides private headers of libQt6QmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmlmodels-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2c859fa129db13f029f3dee095da4b9224b22a7a988f4d411f168f3e8d17c5e94ac3c81a1a572a6de80a724d21b6f6d11126921a2671b0d1a2fe2746399de4d1"

RPROVIDES:${PN} += "qt6-qmlmodels-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlModels \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
