SUMMARY = "Non-ABI stable API for the Qt 6 Qml library"
DESCRIPTION = "This package provides private headers of libQt6Qml that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qml-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "553ca599564f8c474635d9af1174f1e6ed3d697dd1f6cead1d5688931fa8b1fdea3a8e1d745bed44c0b2c3f7468e64d899ec88e1f20a192f7782502fbf2337bf"

RPROVIDES:${PN} += "qt6-qml-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
qt6-core-private-devel"

inherit rpm
