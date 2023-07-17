SUMMARY = "Qt 6 Wayland libraries and tools"
DESCRIPTION = "The Qt6 Wayland libraries and tools."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0d6b4970688e2832d5969ec65289b36a9b8b364d83c43f1a22fedb2b6310f414acae32bf56f7691ec6abc1ad99c51a9a7db3f4ceb589900c7ea923f38c0a561d"

RPROVIDES:${PN} += "libbradient.so \
libdmabuf-server.so \
libdrm-egl-server.so \
libfullscreen-shell-v1.so \
libivi-shell.so \
libqt-plugin-wayland-egl.so \
libqt-shell.so \
libqt-wayland-compositor-dmabuf-server-buffer.so \
libqt-wayland-compositor-drm-egl-server-buffer.so \
libqt-wayland-compositor-linux-dmabuf-unstable-v1.so \
libqt-wayland-compositor-shm-emulation-server.so \
libqt-wayland-compositor-vulkan-server.so \
libqt-wayland-compositor-wayland-egl.so \
libqt-wayland-compositor-wayland-eglstream-controller.so \
libqwayland-egl.so \
libqwayland-generic.so \
libshm-emulation-server.so \
libvulkan-server.so \
libwl-shell-plugin.so \
libxdg-shell.so \
qt6-wayland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6WaylandClient.so.6 \
libQt6WaylandCompositor.so.6 \
libQt6WaylandEglClientHwIntegration.so.6 \
libQt6WaylandEglCompositorHwIntegration.so.6 \
libQt6WlShellIntegration.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
