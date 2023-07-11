SUMMARY = "GObject-based library to interact with the RFB protocol"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package contains the GObject-based library to interact with the \
RFB protocol."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "libgvnc-1_0-0-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "ffd3e55e0b2832680c043f86afed47b8857ac3e699e08a521c205f1b8aa6afff460d40ccde77412ecfb285cc9af08cb600d36df44065310b6ad850075f06ed3a"

RPROVIDES:${PN} += "libgvnc-1-0-0 \
libgvnc-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libsasl2.so.3 \
libz.so.1"

inherit rpm
