SUMMARY = "A keybinding viewer for i3 and other programs"
DESCRIPTION = "A keybinding viewer for i3 and other programs."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "remontoire-1.4.0-1.14.aarch64.rpm"
RPM_HASH = "393cba89019c3db535a727ad059393b00c41824c9fab7fc0c5a455a35f54fc8b383ef329e74a75f01ae4b0b60a47e3ae47e73ac24ed97f4af312f5b27697054a"

RPROVIDES:${PN} += "remontoire"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
