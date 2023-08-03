SUMMARY = "Qt 6 Wayland QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Wayland module"
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-wayland-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2efc69c2a92871667555b31f134474d4e6949c7c8b9025d54ed863623b092516812ec4ede1b516441af24c992b88fc789f4b2f1b8042ff2bccf0534a808ec564"

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
qt6qmlimport-QtWayland.Compositor.2 \
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
