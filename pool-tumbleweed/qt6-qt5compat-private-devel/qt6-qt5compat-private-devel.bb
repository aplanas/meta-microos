SUMMARY = "Non-ABI stable API for the Qt 6 Qt5 Compat library"
DESCRIPTION = "This package provides private headers of libQt6Core5Compat that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "eb431d86e9d44e7d75e6a2794a5e9b4f21a489836546e31ffdf6f46834f80bb10c2bf887f60894f336c886defafdaaf020caa73bba71f4717ecb689d3afdb6ac"

RPROVIDES:${PN} += "qt6-qt5compat-private-devel \
qt6-qt5compat-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Core5Compat) \
qt6-core-private-devel"

inherit rpm
