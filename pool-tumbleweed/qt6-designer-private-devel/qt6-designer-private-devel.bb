SUMMARY = "Non-ABI stable API for the Qt 6 Designer libraries"
DESCRIPTION = "This package provides private headers of libQt6Designer that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-designer-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "dde73eeffae51829052caaa7e3166d415c2aabcf15e6b208eb8247c84b3a37229c80a9284426bb9fa673c1406489857dd99f5b02c5f5c790813871aa2430d7da"

RPROVIDES:${PN} += "qt6-designer-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Designer \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
