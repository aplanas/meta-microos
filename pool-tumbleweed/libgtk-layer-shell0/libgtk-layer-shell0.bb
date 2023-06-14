SUMMARY = "Library to create desktop components for Wayland"
DESCRIPTION = "A library to create panels and other desktop components for Wayland using the Layer Shell protocol"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.8.1"

RPM_NAME = "libgtk-layer-shell0-0.8.1-1.1.aarch64.rpm"
RPM_HASH = "4754a654d3b8bce052734164c62a330dca1aeab8979312cd187a2318855f40003f0b7690c1b5ab166ccc8334ea74d9dc55d61314946f695541dfff993574c202"

RPROVIDES:${PN} += "libgtk-layer-shell.so.0 \
libgtk-layer-shell0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwayland-client.so.0"

inherit rpm
