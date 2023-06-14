SUMMARY = "Extended xdg-desktop-portal backend for Hyprland"
DESCRIPTION = "A fork of xdg-desktop-portal backend for wlroots for Hyprland. It supports \
other wlroots-based Wayland compositors too with some limitations."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "xdg-desktop-portal-hyprland-0.4.0-2.1.aarch64.rpm"
RPM_HASH = "2c53131688f42bc78a3242bbee9a98f8890ab5c83679d415e6f83246b479d52fb99b4631a96fa971a90aed49953ed81bdb6cd1b263a5e1250309bde5ed24027e"

RPROVIDES:${PN} += "xdg-desktop-portal-hyprland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libinih.so.0 \
libpipewire-0.3.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libuuid.so.1 \
libwayland-client.so.0 \
xdg-desktop-portal"

inherit rpm
