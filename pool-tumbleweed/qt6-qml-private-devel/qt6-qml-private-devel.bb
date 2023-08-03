SUMMARY = "Non-ABI stable API for the Qt 6 Qml library"
DESCRIPTION = "This package provides private headers of libQt6Qml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qml-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1668816bd71ce89a76037151ee94961c78fda3774c4e399d66c8f0493b37fe9f983a5f3640e98063d850149692ec76f26dfc7d35ab7b923e2755adce559d01e9"

RPROVIDES:${PN} += "qt6-qml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
qt6-core-private-devel"

inherit rpm
