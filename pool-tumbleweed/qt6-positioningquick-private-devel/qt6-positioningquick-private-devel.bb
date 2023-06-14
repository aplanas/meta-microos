SUMMARY = "Non-ABI stable API for the Qt 6 PositioningQuick Library"
DESCRIPTION = "This package provides private headers of libQt6PositioningQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioningquick-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8ad8d28e30ef71b22cccc71ff9de368612ef2d10b53cead0ea924918ed8fb7430f97bccdbc6ce305a8a7a944e95fdea1452be5a071f9077012c7054f402dc81e"

RPROVIDES:${PN} += "qt6-positioningquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PositioningQuick \
qt6-core-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
