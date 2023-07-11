SUMMARY = "A GTK widget for VNC clients"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "libgtk-vnc-2_0-0-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "6b2cc51e696233643e9d826ea16c51eb73c55690f8148f6941ab2cc5fb93519e0ce2cbd2a563c83445427a0e664dacd7ed5611957e5f9649f0a50dca5911e731"

RPROVIDES:${PN} += "gtk-vnc \
libgtk-vnc-2-0-0 \
libgtk-vnc-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgvnc-1.0.so.0"

inherit rpm
