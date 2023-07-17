SUMMARY = "Non-ABI stable API for the Qt6 WaylandCompositor library"
DESCRIPTION = "This package provides private headers of libQt6WaylandCompositor that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandcompositor-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a9fac08722ae42380d0cbcdbf09f8c2262dab61e34f0391971188ef52d637b2803bb1f1d7b04a8f1b6334b1ef6b0a8a468702c47315272cc5c0edd41924b662a"

RPROVIDES:${PN} += "qt6-waylandcompositor-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandCompositor \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
