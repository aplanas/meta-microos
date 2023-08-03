SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickInput library"
DESCRIPTION = "This package provides private headers of libQt63DQuickInput that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickinput-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b7d3c9e2572f88e236fde18e0c95193b60bf5de0e6b172129fac628f04555583e4cb5dca92fda4f8fa5512a359f6d489d3cc2beb2fe992d1924c07d4cdbf6120"

RPROVIDES:${PN} += "qt6-3dquickinput-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickInput \
qt6-3dcore-private-devel \
qt6-3dinput-private-devel \
qt6-3dquick-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
