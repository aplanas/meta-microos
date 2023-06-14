SUMMARY = "Examples for the qt6-wayland modules"
DESCRIPTION = "Examples for the qt6-wayland modules."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b3ae642c889fe2349dc0464976ca071dee97dfa0587fd22861ee9360f3edb7a17cfc57fe873761e19b85481eb9bbcf4a08f15375e7c96d1e0a8e8271d243a2fc"

RPROVIDES:${PN} += "libexampleshellplugin.so \
qt6-wayland-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6WaylandClient.so.6 \
libQt6WaylandCompositor.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
