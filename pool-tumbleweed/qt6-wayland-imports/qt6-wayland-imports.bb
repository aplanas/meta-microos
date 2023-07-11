SUMMARY = "Qt 6 Wayland QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Wayland module"
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-imports-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "8bc37c1468d44fcb5780079a8312b427a244cd95a8eb2aa9fd56920c05851626a52ce260bfa75fc1a607b42dbf07a9075493c48c8deec40d665874a045a97a90"

RPROVIDES:${PN} += "libqwaylandcompositorplugin.so \
libwaylandcompositoriviapplicationplugin.so \
libwaylandcompositorpresentationtimeplugin.so \
libwaylandcompositorqtshellplugin.so \
libwaylandcompositorwlshellplugin.so \
libwaylandcompositorxdgshellplugin.so \
libwaylandtexturesharingextensionplugin.so \
libwaylandtexturesharingplugin.so \
qt6-wayland-imports \
qt6qmlimport-QtWayland.Client.TextureSharing.1 \
qt6qmlimport-QtWayland.Compositor.1 \
qt6qmlimport-QtWayland.Compositor.6 \
qt6qmlimport-QtWayland.Compositor.IviApplication.1 \
qt6qmlimport-QtWayland.Compositor.IviApplication.6 \
qt6qmlimport-QtWayland.Compositor.PresentationTime.1 \
qt6qmlimport-QtWayland.Compositor.PresentationTime.6 \
qt6qmlimport-QtWayland.Compositor.QtShell.1 \
qt6qmlimport-QtWayland.Compositor.QtShell.6 \
qt6qmlimport-QtWayland.Compositor.TextureSharingExtension.1 \
qt6qmlimport-QtWayland.Compositor.WlShell.1 \
qt6qmlimport-QtWayland.Compositor.WlShell.6 \
qt6qmlimport-QtWayland.Compositor.XdgShell.1 \
qt6qmlimport-QtWayland.Compositor.XdgShell.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WaylandClient.so.6 \
libQt6WaylandCompositor.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
