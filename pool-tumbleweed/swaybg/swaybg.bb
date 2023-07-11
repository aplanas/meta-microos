SUMMARY = "Wallpaper tool for Wayland compositors"
DESCRIPTION = "swaybg is a wallpaper utility for Wayland compositors. It is compatible with any Wayland compositor which implements the following Wayland protocols: \
wlr-layer-shell, xdg-output, xdg-shell."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "swaybg-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "b11a1f9a980ce0c2f39a40d57b81d302b0e23c6c34b45e7ff1b70d55a71380ea64719ddcedb4456a433e58d5435ebcf428172f77f02232bcdad4aba3b5abc675"

RPROVIDES:${PN} += "swaybg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgobject-2.0.so.0 \
libwayland-client.so.0"

inherit rpm
