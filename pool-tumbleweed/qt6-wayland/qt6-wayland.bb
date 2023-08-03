SUMMARY = "Qt 6 Wayland libraries and tools"
DESCRIPTION = "The Qt6 Wayland libraries and tools."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-wayland-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "9776a0cf1ea9977048946b3e09ed5d50374b1c65b1e08ca8955f8a99fb5d44ef9b371735a087a3835085227f4928a593bf002e734c9994db910696cc629b8f0e"

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
