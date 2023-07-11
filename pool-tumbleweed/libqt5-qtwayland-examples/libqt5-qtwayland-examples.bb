SUMMARY = "Qt5 wayland examples"
DESCRIPTION = "Examples for libqt5-qtwayland module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde51"

RPM_NAME = "libqt5-qtwayland-examples-5.15.10+kde51-1.1.aarch64.rpm"
RPM_HASH = "8ddb8609425ad413e5b44c8032e95ba24249b9ebbed5a79b83c33aa82cf8d90f54bc7113de5f85314eb48c384228dbe00e23ffa071902c895cedf0f5a1142da4"

RPROVIDES:${PN} += "libqt5-qtwayland-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5WaylandClient.so.5 \
libQt5WaylandCompositor.so.5 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.VirtualKeyboard.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtWayland.Client.TextureSharing.1 \
qt5qmlimport-QtWayland.Compositor.1"

inherit rpm
