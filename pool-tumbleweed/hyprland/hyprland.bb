SUMMARY = "Dynamic tiling Wayland compositor"
DESCRIPTION = "Hyprland is a dynamic tiling Wayland compositor based on wlroots \
that doesn't sacrifice on its looks. \
 \
It supports multiple layouts, fancy effects, has a very flexible IPC \
model allowing for a lot of customization, and more."
LICENSE = "BSD-3-Clause"

PV = "0.28.0"

RPM_NAME = "hyprland-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "95c9cc0104a7f9dacf552d1eef49c1283902e373b98bdd76c5ed904481fcee5a21c4a1ca5125c3353d19ee36132a29ca002e328c30143784d9b194978af2b620"

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
