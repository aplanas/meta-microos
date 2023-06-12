SUMMARY = "Qt 6 Wayland QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Wayland module"
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "f3877976acae295696c916ae0938d284aa039a9032a2392a610b5851cd848cc0d2b8e7c126e36e693a8d41529aa5b92d4f84c4028db03d45845e740bfff99325"

RPROVIDES:${PN} += "libqwaylandcompositorplugin.so()(64bit) \
libqwaylandcompositorplugin.so(Qt_6)(64bit) \
libqwaylandcompositorplugin.so(Qt_6.0)(64bit) \
libqwaylandcompositorplugin.so(Qt_6.1)(64bit) \
libqwaylandcompositorplugin.so(Qt_6.2)(64bit) \
libqwaylandcompositorplugin.so(Qt_6.3)(64bit) \
libqwaylandcompositorplugin.so(Qt_6.4)(64bit) \
libqwaylandcompositorplugin.so(Qt_6.5)(64bit) \
libqwaylandcompositorplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libwaylandcompositoriviapplicationplugin.so()(64bit) \
libwaylandcompositoriviapplicationplugin.so(Qt_6)(64bit) \
libwaylandcompositoriviapplicationplugin.so(Qt_6.0)(64bit) \
libwaylandcompositoriviapplicationplugin.so(Qt_6.1)(64bit) \
libwaylandcompositoriviapplicationplugin.so(Qt_6.2)(64bit) \
libwaylandcompositoriviapplicationplugin.so(Qt_6.3)(64bit) \
libwaylandcompositoriviapplicationplugin.so(Qt_6.4)(64bit) \
libwaylandcompositoriviapplicationplugin.so(Qt_6.5)(64bit) \
libwaylandcompositoriviapplicationplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libwaylandcompositorpresentationtimeplugin.so()(64bit) \
libwaylandcompositorpresentationtimeplugin.so(Qt_6)(64bit) \
libwaylandcompositorpresentationtimeplugin.so(Qt_6.0)(64bit) \
libwaylandcompositorpresentationtimeplugin.so(Qt_6.1)(64bit) \
libwaylandcompositorpresentationtimeplugin.so(Qt_6.2)(64bit) \
libwaylandcompositorpresentationtimeplugin.so(Qt_6.3)(64bit) \
libwaylandcompositorpresentationtimeplugin.so(Qt_6.4)(64bit) \
libwaylandcompositorpresentationtimeplugin.so(Qt_6.5)(64bit) \
libwaylandcompositorpresentationtimeplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libwaylandcompositorqtshellplugin.so()(64bit) \
libwaylandcompositorqtshellplugin.so(Qt_6)(64bit) \
libwaylandcompositorqtshellplugin.so(Qt_6.0)(64bit) \
libwaylandcompositorqtshellplugin.so(Qt_6.1)(64bit) \
libwaylandcompositorqtshellplugin.so(Qt_6.2)(64bit) \
libwaylandcompositorqtshellplugin.so(Qt_6.3)(64bit) \
libwaylandcompositorqtshellplugin.so(Qt_6.4)(64bit) \
libwaylandcompositorqtshellplugin.so(Qt_6.5)(64bit) \
libwaylandcompositorqtshellplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libwaylandcompositorwlshellplugin.so()(64bit) \
libwaylandcompositorwlshellplugin.so(Qt_6)(64bit) \
libwaylandcompositorwlshellplugin.so(Qt_6.0)(64bit) \
libwaylandcompositorwlshellplugin.so(Qt_6.1)(64bit) \
libwaylandcompositorwlshellplugin.so(Qt_6.2)(64bit) \
libwaylandcompositorwlshellplugin.so(Qt_6.3)(64bit) \
libwaylandcompositorwlshellplugin.so(Qt_6.4)(64bit) \
libwaylandcompositorwlshellplugin.so(Qt_6.5)(64bit) \
libwaylandcompositorwlshellplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libwaylandcompositorxdgshellplugin.so()(64bit) \
libwaylandcompositorxdgshellplugin.so(Qt_6)(64bit) \
libwaylandcompositorxdgshellplugin.so(Qt_6.0)(64bit) \
libwaylandcompositorxdgshellplugin.so(Qt_6.1)(64bit) \
libwaylandcompositorxdgshellplugin.so(Qt_6.2)(64bit) \
libwaylandcompositorxdgshellplugin.so(Qt_6.3)(64bit) \
libwaylandcompositorxdgshellplugin.so(Qt_6.4)(64bit) \
libwaylandcompositorxdgshellplugin.so(Qt_6.5)(64bit) \
libwaylandcompositorxdgshellplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libwaylandtexturesharingextensionplugin.so()(64bit) \
libwaylandtexturesharingextensionplugin.so(Qt_6)(64bit) \
libwaylandtexturesharingextensionplugin.so(Qt_6.0)(64bit) \
libwaylandtexturesharingextensionplugin.so(Qt_6.1)(64bit) \
libwaylandtexturesharingextensionplugin.so(Qt_6.2)(64bit) \
libwaylandtexturesharingextensionplugin.so(Qt_6.3)(64bit) \
libwaylandtexturesharingextensionplugin.so(Qt_6.4)(64bit) \
libwaylandtexturesharingextensionplugin.so(Qt_6.5)(64bit) \
libwaylandtexturesharingextensionplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libwaylandtexturesharingplugin.so()(64bit) \
libwaylandtexturesharingplugin.so(Qt_6)(64bit) \
libwaylandtexturesharingplugin.so(Qt_6.0)(64bit) \
libwaylandtexturesharingplugin.so(Qt_6.1)(64bit) \
libwaylandtexturesharingplugin.so(Qt_6.2)(64bit) \
libwaylandtexturesharingplugin.so(Qt_6.3)(64bit) \
libwaylandtexturesharingplugin.so(Qt_6.4)(64bit) \
libwaylandtexturesharingplugin.so(Qt_6.5)(64bit) \
libwaylandtexturesharingplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-wayland-imports \
qt6-wayland-imports(aarch-64) \
qt6qmlimport(QtWayland.Client.TextureSharing.1) \
qt6qmlimport(QtWayland.Compositor.1) \
qt6qmlimport(QtWayland.Compositor.6) \
qt6qmlimport(QtWayland.Compositor.IviApplication.1) \
qt6qmlimport(QtWayland.Compositor.IviApplication.6) \
qt6qmlimport(QtWayland.Compositor.PresentationTime.1) \
qt6qmlimport(QtWayland.Compositor.PresentationTime.6) \
qt6qmlimport(QtWayland.Compositor.QtShell.1) \
qt6qmlimport(QtWayland.Compositor.QtShell.6) \
qt6qmlimport(QtWayland.Compositor.TextureSharingExtension.1) \
qt6qmlimport(QtWayland.Compositor.WlShell.1) \
qt6qmlimport(QtWayland.Compositor.WlShell.6) \
qt6qmlimport(QtWayland.Compositor.XdgShell.1) \
qt6qmlimport(QtWayland.Compositor.XdgShell.6)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6WaylandClient.so.6()(64bit) \
libQt6WaylandClient.so.6(Qt_6)(64bit) \
libQt6WaylandClient.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6WaylandCompositor.so.6()(64bit) \
libQt6WaylandCompositor.so.6(Qt_6)(64bit) \
libQt6WaylandCompositor.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit)"

inherit rpm