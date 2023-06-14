SUMMARY = "GObject-based library to interact with the RFB protocol"
DESCRIPTION = "gtk-vnc is a VNC viewer widget for GTK+. It is built using coroutines \
allowing it to be completely asynchronous while remaining single \
threaded. \
 \
This package contains the GObject-based library to interact with the \
RFB protocol."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "libgvnc-1_0-0-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "0e62f817d3a5a1a5415e87607d1009f2e01475a2556a8b4b1140885231127efa3fbbbbbeed0b86e0020b7fae75f4dc88cd98f042bc3d434ecdb6f38a7adf9ca0"

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
