SUMMARY = "Non-ABI stable API for the Qt 6 Qml library"
DESCRIPTION = "This package provides private headers of libQt6Qml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qml-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9c7737645ba915cefd39aec4f965d8612399853461da3ec144d42568bce492c3d9de8f0f8afd45033e1dd3bcf96a2e36f073c5b17c4d6f9653615c4887c5a444"

RPROVIDES:${PN} += "qt6-qml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
qt6-core-private-devel"

inherit rpm
