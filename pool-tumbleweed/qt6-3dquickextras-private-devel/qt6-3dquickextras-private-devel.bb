SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickExtras library"
DESCRIPTION = "This package provides private headers of libQt63DQuickExtras that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickextras-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8718279acc20f0a875c85b15053f2ba55cc5e43c520b1bae3272248d1515ccc14f9decaf9fc3cd20c52c03c013a29e324c743832396b5d9b777cca6acb3006bf"

RPROVIDES:${PN} += "qt6-3dquickextras-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickExtras \
qt6-3dextras-private-devel \
qt6-3dquick-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
