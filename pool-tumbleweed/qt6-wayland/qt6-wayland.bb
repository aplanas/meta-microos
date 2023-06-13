SUMMARY = "Qt 6 Wayland libraries and tools"
DESCRIPTION = "The Qt6 Wayland libraries and tools."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "687a4c5cf4afcdc97c17de8a5056da64429e27892502ed27af2493661e7764cb2fc5358eefc447b7dc1f2b8a6cf424ae22c4dfa365ccff0f8e55cc4a9cf9903c"

RPROVIDES:${PN} += "libbradient.so()(64bit) \
libbradient.so(Qt_6)(64bit) \
libdmabuf-server.so()(64bit) \
libdmabuf-server.so(Qt_6)(64bit) \
libdrm-egl-server.so()(64bit) \
libdrm-egl-server.so(Qt_6)(64bit) \
libfullscreen-shell-v1.so()(64bit) \
libfullscreen-shell-v1.so(Qt_6)(64bit) \
libivi-shell.so()(64bit) \
libivi-shell.so(Qt_6)(64bit) \
libqt-plugin-wayland-egl.so()(64bit) \
libqt-plugin-wayland-egl.so(Qt_6)(64bit) \
libqt-shell.so()(64bit) \
libqt-shell.so(Qt_6)(64bit) \
libqt-wayland-compositor-dmabuf-server-buffer.so()(64bit) \
libqt-wayland-compositor-dmabuf-server-buffer.so(Qt_6)(64bit) \
libqt-wayland-compositor-drm-egl-server-buffer.so()(64bit) \
libqt-wayland-compositor-drm-egl-server-buffer.so(Qt_6)(64bit) \
libqt-wayland-compositor-linux-dmabuf-unstable-v1.so()(64bit) \
libqt-wayland-compositor-linux-dmabuf-unstable-v1.so(Qt_6)(64bit) \
libqt-wayland-compositor-shm-emulation-server.so()(64bit) \
libqt-wayland-compositor-shm-emulation-server.so(Qt_6)(64bit) \
libqt-wayland-compositor-vulkan-server.so()(64bit) \
libqt-wayland-compositor-vulkan-server.so(Qt_6)(64bit) \
libqt-wayland-compositor-wayland-egl.so()(64bit) \
libqt-wayland-compositor-wayland-egl.so(Qt_6)(64bit) \
libqt-wayland-compositor-wayland-eglstream-controller.so()(64bit) \
libqt-wayland-compositor-wayland-eglstream-controller.so(Qt_6)(64bit) \
libqwayland-egl.so()(64bit) \
libqwayland-egl.so(Qt_6)(64bit) \
libqwayland-generic.so()(64bit) \
libqwayland-generic.so(Qt_6)(64bit) \
libshm-emulation-server.so()(64bit) \
libshm-emulation-server.so(Qt_6)(64bit) \
libvulkan-server.so()(64bit) \
libvulkan-server.so(Qt_6)(64bit) \
libwl-shell-plugin.so()(64bit) \
libwl-shell-plugin.so(Qt_6)(64bit) \
libxdg-shell.so()(64bit) \
libxdg-shell.so(Qt_6)(64bit) \
qt6-wayland \
qt6-wayland(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6WaylandClient.so.6()(64bit) \
libQt6WaylandClient.so.6(Qt_6)(64bit) \
libQt6WaylandCompositor.so.6()(64bit) \
libQt6WaylandCompositor.so.6(Qt_6)(64bit) \
libQt6WaylandEglClientHwIntegration.so.6()(64bit) \
libQt6WaylandEglCompositorHwIntegration.so.6()(64bit) \
libQt6WlShellIntegration.so.6()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit)"

inherit rpm
