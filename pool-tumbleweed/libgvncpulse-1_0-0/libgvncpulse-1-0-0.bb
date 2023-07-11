SUMMARY = "Pulse audio bridge for VNC client connections"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package contains the Pulse audio bridge for VNC client connections."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "libgvncpulse-1_0-0-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "9d9616021b46ad4a01ecd69fb242216118a476d13be297dd84ec76aad8bcde9cbb1f792a195171adbff17ecf0a02b0eabff99022977876bea8e340b18187ec89"

RPROVIDES:${PN} += "libgvncpulse-1-0-0 \
libgvncpulse-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgvnc-1.0.so.0 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
