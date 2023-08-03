SUMMARY = "Non-ABI stable API for the Qt 6 SVG libraries"
DESCRIPTION = "This package provides private headers of libQt6Svg that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-svg-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ea57d369c09484470387f47d9f24fdbe3369918f04a3c0a6a7f1be77872b463fb0aae0f1326a7c41af24a605bf5efa3c93fbabd4ab782edd3fd7cdaa8a708530"

RPROVIDES:${PN} += "qt6-svg-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Svg \
cmake-Qt6SvgWidgets \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
