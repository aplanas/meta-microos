SUMMARY = "Examples for the qt6-wayland modules"
DESCRIPTION = "Examples for the qt6-wayland modules."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-wayland-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0cd8c3be9fdfff2f396fcdb92f81b5063daaff72c1860f6ff27dc4b58d393980a431ee29ae0acb7aac6a9a264d8094cd6e2c85bf17afa1988b2797d4bfd5acd8"

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
