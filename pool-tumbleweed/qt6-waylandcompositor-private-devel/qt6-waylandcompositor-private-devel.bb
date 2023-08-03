SUMMARY = "Non-ABI stable API for the Qt6 WaylandCompositor library"
DESCRIPTION = "This package provides private headers of libQt6WaylandCompositor that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-waylandcompositor-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ebf96a0cce761551f145f3040a703c0e0bc9be80eaeca6fd4f4f16c9c09ad58450ba1687d7d26bd0a97638fdeb58158175c164aa001dc59125677a5f9dc7012e"

RPROVIDES:${PN} += "qt6-waylandcompositor-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandCompositor \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
