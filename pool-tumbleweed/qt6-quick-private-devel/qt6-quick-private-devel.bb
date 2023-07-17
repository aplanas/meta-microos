SUMMARY = "Non-ABI stable API for the Qt 6 Quick library"
DESCRIPTION = "This package provides private headers of libQt6Quick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quick-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "83e62a63a17cb7b1e19de43df0543da7bf14919bc2be679426ad1f8c8c8397f6df96d200ad443560936b8381de9c58ef3263cfd2350aa82fe4353566b6a045fe"

RPROVIDES:${PN} += "qt6-quick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-qmlmodels-private-devel"

inherit rpm
