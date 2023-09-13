SUMMARY = "Extended xdg-desktop-portal backend for Hyprland"
DESCRIPTION = "A fork of xdg-desktop-portal backend for wlroots for Hyprland. It supports \
other wlroots-based Wayland compositors too with some limitations."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "xdg-desktop-portal-hyprland-1.0.0-5.1.aarch64.rpm"
RPM_HASH = "24ccfa790ba109477fc2597ee39c8be7dfb17d3b630a0d07d6c3ed694401b8c270cbd8e55705f94fcf85fc1b2e368eabdde309956d6199104a3d6ac19b56c299"

RPROVIDES:${PN} += "xdg-desktop-portal-hyprland"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libpipewire-0.3.so.0 \
libsdbus-c++.so.1 \
libstdc++.so.6 \
libwayland-client.so.0 \
xdg-desktop-portal"

inherit rpm
