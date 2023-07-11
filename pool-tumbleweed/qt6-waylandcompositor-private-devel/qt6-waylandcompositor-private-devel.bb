SUMMARY = "Non-ABI stable API for the Qt6 WaylandCompositor library"
DESCRIPTION = "This package provides private headers of libQt6WaylandCompositor that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandcompositor-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "bdc2c49336e23a493c0ea5e6b6f7f32ee77a1b89c9154de60764907f567e71a68b33628771acce68d535726780ac6444d1a227b1e79d2a20738c6d2ea2d8d112"

RPROVIDES:${PN} += "qt6-waylandcompositor-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandCompositor"

inherit rpm
