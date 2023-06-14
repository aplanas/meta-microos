SUMMARY = "Simple color selector"
DESCRIPTION = "Gcolor2 is a GTK2 color selector to provide a quick and easy way to find \
colors for whatever task is at hand. Colors can be saved and deleted as well."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "gcolor2-0.4-5.14.aarch64.rpm"
RPM_HASH = "2a02226a522cbbe4d0dc5c700e90a1d5d168879930971e39f8c8e07c5b4d9f7e20300b9c4f1b13b3049eee333bd0cd4b87456b0be89a531ab1b01404947b8872"

RPROVIDES:${PN} += "gcolor2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
