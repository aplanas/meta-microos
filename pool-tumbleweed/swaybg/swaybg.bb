SUMMARY = "Wallpaper tool for Wayland compositors"
DESCRIPTION = "swaybg is a wallpaper utility for Wayland compositors. It is compatible with any Wayland compositor which implements the following Wayland protocols: \
wlr-layer-shell, xdg-output, xdg-shell."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "swaybg-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "75378a66ee270c553e31bc6de2d03bba90f51e59d526aaecd6b29b75edf5f0e61d137b2e0daa4dddb8062631e10b78b236648a6ec0125a040b242b0a504b7c4a"

RPROVIDES:${PN} += "swaybg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgobject-2.0.so.0 \
libwayland-client.so.0"

inherit rpm
