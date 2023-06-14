SUMMARY = "Launcher for wlroots compositors"
DESCRIPTION = "Wofi is a launcher/menu program for wlroots based wayland compositors such as sway."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "wofi-1.3-1.3.aarch64.rpm"
RPM_HASH = "805d0df858f3c0175243210b570171b802a971ff4d80d6d64db25c0cfb0561b319e1b2aee41e00659fc0d328f1a954c40a850a46e78c6c5a86354a6d2fb3202e"

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
