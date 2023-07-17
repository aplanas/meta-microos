SUMMARY = "Non-ABI stable API for the Qt 6 PositioningQuick Library"
DESCRIPTION = "This package provides private headers of libQt6PositioningQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioningquick-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "1995b9ccc918fd449e2adae6d38814fe380b4fba922833c32bd2002c519ae4e070d214b0fb6a3e89fcc5ad4a7443634b2559b8763f675eddb9b8d6156b67d994"

RPROVIDES:${PN} += "qt6-positioningquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PositioningQuick \
qt6-positioning-private-devel \
qt6-quick-private-devel"

inherit rpm
