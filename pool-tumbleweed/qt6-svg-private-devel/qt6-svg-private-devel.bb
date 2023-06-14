SUMMARY = "Non-ABI stable API for the Qt 6 SVG libraries"
DESCRIPTION = "This package provides private headers of libQt6Svg that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-svg-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a0724fba04e54a7092ba7b80905bf175e809e3885eb2886a2a726a4bbf840c638012b7a5e863712c7d6fef9c34b1c929fb726ba54aed7cabb55ab14065d9646e"

RPROVIDES:${PN} += "qt6-svg-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Svg \
cmake-Qt6SvgWidgets \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
