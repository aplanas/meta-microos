SUMMARY = "Examples for the qt6-wayland modules"
DESCRIPTION = "Examples for the qt6-wayland modules."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-examples-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "ede272ad010e8471b9b985683a3b6095711d489bd73778b71ec266bf499a7a53d6ad9fe145b43196d2c55d1f48cc5ac2d42b4771964843bb6a5864fd731dc0ef"

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
