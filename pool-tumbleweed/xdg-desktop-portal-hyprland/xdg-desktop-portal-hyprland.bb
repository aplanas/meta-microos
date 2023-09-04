SUMMARY = "Extended xdg-desktop-portal backend for Hyprland"
DESCRIPTION = "A fork of xdg-desktop-portal backend for wlroots for Hyprland. It supports \
other wlroots-based Wayland compositors too with some limitations."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "xdg-desktop-portal-hyprland-0.5.0-3.1.aarch64.rpm"
RPM_HASH = "729a545546a8c7e866f1e0eaa2f6aba0340f97005181b36411b6a239813c4142b8891a0436e204dfb4f9b7953df5246141947aac5eb3ee913f15b9ca85556d5f"

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
