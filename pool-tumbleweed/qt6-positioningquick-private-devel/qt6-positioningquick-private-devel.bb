SUMMARY = "Non-ABI stable API for the Qt 6 PositioningQuick Library"
DESCRIPTION = "This package provides private headers of libQt6PositioningQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioningquick-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "1d18993c1ce4c6334e0d192fe3281a6c4e3c772c2087496a37d0e50999e5425a8abcb988e95d96b0c28b98d75e6b194b0cf668f9aac7fa4a90ce2a0eacdf4554"

RPROVIDES:${PN} += "qt6-positioningquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PositioningQuick \
qt6-core-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
