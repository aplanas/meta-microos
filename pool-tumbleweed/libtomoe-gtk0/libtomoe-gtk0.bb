SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "libtomoe-gtk0-0.6.0-44.25.aarch64.rpm"
RPM_HASH = "46ca38588cd093b7bea903e3833437ec5e9d9a10c4e79117d4342de5e1bf93f99a8d339aa9193a2054310714bc1c2c3e9bb7af27597a1b9dfd55178a07fcff9f"

RPROVIDES:${PN} += "libtomoe-gtk.so.0 \
libtomoe-gtk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libtomoe.so.0 \
tomoe-gtk"

inherit rpm
