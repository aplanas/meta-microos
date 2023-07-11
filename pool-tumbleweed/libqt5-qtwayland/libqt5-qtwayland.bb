SUMMARY = "Qt 5 Wayland Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde51"

RPM_NAME = "libqt5-qtwayland-5.15.10+kde51-1.1.aarch64.rpm"
RPM_HASH = "e77cec9277feec1d54cd0828acc5a90dea250b553fafd8ad8a1e9f1e18225c68a0fbccd5231a45eda7fcadb35e601df23c1657974d8bf19f3512c7e0b3690ebf"

RPROVIDES:${PN} += "libbradient.so \
libdmabuf-server.so \
libdrm-egl-server.so \
libfullscreen-shell-v1.so \
libivi-shell.so \
libqt-plugin-wayland-egl.so \
libqt-wayland-compositor-dmabuf-server-buffer.so \
libqt-wayland-compositor-drm-egl-server-buffer.so \
libqt-wayland-compositor-linux-dmabuf-unstable-v1.so \
libqt-wayland-compositor-shm-emulation-server.so \
libqt-wayland-compositor-vulkan-server.so \
libqt-wayland-compositor-wayland-egl.so \
libqt-wayland-compositor-wayland-eglstream-controller.so \
libqt-wayland-compositor-xcomposite-egl.so \
libqt5-qtwayland \
libqwayland-egl.so \
libqwayland-generic.so \
libqwayland-xcomposite-egl.so \
libqwaylandcompositorplugin.so \
libqwaylandtexturesharing.so \
libqwaylandtexturesharingextension.so \
libshm-emulation-server.so \
libvulkan-server.so \
libwl-shell.so \
libxcomposite-egl.so \
libxdg-shell-v5.so \
libxdg-shell-v6.so \
libxdg-shell.so \
qt5qmlimport-QtWayland.Client.TextureSharing.1 \
qt5qmlimport-QtWayland.Compositor.1 \
qt5qmlimport-QtWayland.Compositor.TextureSharingExtension.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WaylandClient.so.5 \
libQt5WaylandCompositor.so.5 \
libX11.so.6 \
libXcomposite.so.1 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0"

inherit rpm
