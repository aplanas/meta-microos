SUMMARY = "Dynamic tiling Wayland compositor"
DESCRIPTION = "Hyprland is a dynamic tiling Wayland compositor based on wlroots \
that doesn't sacrifice on its looks. \
 \
It supports multiple layouts, fancy effects, has a very flexible IPC \
model allowing for a lot of customization, and more."
LICENSE = "BSD-3-Clause"

PV = "0.27.2"

RPM_NAME = "hyprland-0.27.2-1.1.aarch64.rpm"
RPM_HASH = "fbbd22574adb9cf4fb42cf5a422d07457db953a066fa18c8e2b91573968d720d4fec4616e74f4c9f6730011fc2173b08d63c316f592ab09b4f2c14d8de8e7264"

RPROVIDES:${PN} += "hyprland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libcairo.so.2 \
libdisplay-info.so.1 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libinput.so.10 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpixman-1.so.0 \
libseat.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
libudev.so.1 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-dri3.so.0 \
libxcb-errors.so.0 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-present.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb-res.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb-xinput.so.0 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
