SUMMARY = "Wayland wallpaper utility with IPC controls"
DESCRIPTION = "Hyprpaper is a wallpaper utility for Hyprland. \
It supports IPC controls for Hyprland and various \
image formats."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "hyprpaper-0.3.0-1.1.aarch64.rpm"
RPM_HASH = "93150bd07e6d3419a336588da7b3204272c5fe4b1dc12407f8508f7518b7a8069ce696dd10b1ef9a61bf8a3f71477969184ee9b051f89e519b94296d29d307fa"

RPROVIDES:${PN} += "hyprpaper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libjpeg.so.8 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
