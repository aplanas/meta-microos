SUMMARY = "Dynamic tiling Wayland compositor"
DESCRIPTION = "Hyprland is a dynamic tiling Wayland compositor based on wlroots \
that doesn't sacrifice on its looks. \
 \
It supports multiple layouts, fancy effects, has a very flexible IPC \
model allowing for a lot of customization, and more."
LICENSE = "BSD-3-Clause"

PV = "0.26.0"

RPM_NAME = "hyprland-0.26.0-1.1.aarch64.rpm"
RPM_HASH = "ebd1acdb0a9589716ab939f50f89a2b61e39681354e6ba405f37a95b429ecffa9536c82953d9059fa9f2e53c7c296ec181bd16f58594520f300e186fe780f235"

RPROVIDES:${PN} += "hyprland \
hyprland(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libdisplay-info.so.1()(64bit) \
libdrm.so.2()(64bit) \
libgbm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libinput.so.10()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpixman-1.so.0()(64bit) \
libseat.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libvulkan.so.1()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libxcb-composite.so.0()(64bit) \
libxcb-dri3.so.0()(64bit) \
libxcb-errors.so.0()(64bit) \
libxcb-ewmh.so.2()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-present.so.0()(64bit) \
libxcb-render-util.so.0()(64bit) \
libxcb-render.so.0()(64bit) \
libxcb-res.so.0()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb-xinput.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
