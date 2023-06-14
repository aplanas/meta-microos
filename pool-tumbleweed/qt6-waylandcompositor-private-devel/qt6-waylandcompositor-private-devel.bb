SUMMARY = "Non-ABI stable API for the Qt6 WaylandCompositor library"
DESCRIPTION = "This package provides private headers of libQt6WaylandCompositor that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-waylandcompositor-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "623d02a0692dca5abf85eacdc687ed8035c54ef5b7464968d0970a3631df4dae93def5d2437f08c1abf38a740f098093f46342690b5ed1c924e9b87be4583dea"

RPROVIDES:${PN} += "qt6-waylandcompositor-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandCompositor"

inherit rpm
