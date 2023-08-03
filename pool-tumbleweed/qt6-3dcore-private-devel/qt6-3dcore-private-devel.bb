SUMMARY = "Non-ABI stable API for the Qt 6 3DCore library"
DESCRIPTION = "This package provides private headers of libQt63DCore that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dcore-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "13951326965626d7f81d6445961a54100be8420bb44ad6c69b94e1271e0f5b1ed455ab88df7ac8d80ff069c92b8c47322d98a248e9e0b565415310b165702b7d"

RPROVIDES:${PN} += "qt6-3dcore-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCore \
cmake-Qt6Concurrent \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
