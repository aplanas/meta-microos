SUMMARY = "Non-ABI stable API for the Qt 6 QmlWorkerScript library"
DESCRIPTION = "This package provides private headers of libQt6QmlWorkerScript that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmlworkerscript-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8c1c70df489e0a99d8bb23f3a9d4c95d0d43e33ac89707a5a940a8653b8afcf887e8167fe4ff4a5a1fd4d701f5a048ae4ae9e61b1c0b935c46515449bd093ba8"

RPROVIDES:${PN} += "qt6-qmlworkerscript-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlWorkerScript \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
