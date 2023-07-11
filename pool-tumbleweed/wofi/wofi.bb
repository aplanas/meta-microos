SUMMARY = "Launcher for wlroots compositors"
DESCRIPTION = "Wofi is a launcher/menu program for wlroots based wayland compositors such as sway."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "wofi-1.3-1.4.aarch64.rpm"
RPM_HASH = "c5f32e148b26fe3578ce6f557e882934907b0793e146eb665b4b5d0760b5de98e3838163b7751bbd1f97a0fbee29a2a0a213b3f72668cbe4b4ca4a7be872d5b7"

RPROVIDES:${PN} += "wofi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libwayland-client.so.0"

inherit rpm
