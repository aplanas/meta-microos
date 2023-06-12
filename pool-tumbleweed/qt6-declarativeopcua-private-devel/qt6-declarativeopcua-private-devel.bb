SUMMARY = "Non-ABI stable API for the Qt 6 DeclarativeOpcua library"
DESCRIPTION = "This package provides private headers of libDeclarativeOpcua that do not have \
any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarativeopcua-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2267eb83bce978d7d92e97dbda7f3780332f145281f648d257695f327b4dad66f7e8e77a3133fdf987558e46f59697e7fd27d08f3c4789e5d4c09e2d2a06f7c7"

RPROVIDES:${PN} += "cmake(Qt6DeclarativeOpcua) \
pkgconfig(Qt6DeclarativeOpcua) \
qt6-declarativeopcua-private-devel \
qt6-declarativeopcua-private-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Gui) \
cmake(Qt6OpcUa) \
cmake(Qt6Quick) \
libQt6DeclarativeOpcua6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6OpcUa) \
pkgconfig(Qt6Quick)"

inherit rpm
