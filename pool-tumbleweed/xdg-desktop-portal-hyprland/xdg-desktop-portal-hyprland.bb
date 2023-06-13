SUMMARY = "Extended xdg-desktop-portal backend for Hyprland"
DESCRIPTION = "A fork of xdg-desktop-portal backend for wlroots for Hyprland. It supports \
other wlroots-based Wayland compositors too with some limitations."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "xdg-desktop-portal-hyprland-0.4.0-2.1.aarch64.rpm"
RPM_HASH = "2c53131688f42bc78a3242bbee9a98f8890ab5c83679d415e6f83246b479d52fb99b4631a96fa971a90aed49953ed81bdb6cd1b263a5e1250309bde5ed24027e"

RPROVIDES:${PN} += "xdg-desktop-portal-hyprland \
xdg-desktop-portal-hyprland(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libgbm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libinih.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libuuid.so.1()(64bit) \
libwayland-client.so.0()(64bit) \
xdg-desktop-portal"

inherit rpm
