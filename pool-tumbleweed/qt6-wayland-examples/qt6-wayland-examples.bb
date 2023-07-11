SUMMARY = "Examples for the qt6-wayland modules"
DESCRIPTION = "Examples for the qt6-wayland modules."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "93d743b43b5a813afe8e09dd9c0764d155c47c644f12f734205a0aa332d986b67cce000cb3c4a3752d05aaa6c80f6c817d95548a274fec1c20ddb0bdec5096c9"

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
