SUMMARY = "Window Navigator Construction Kit (Library Package)"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs."
LICENSE = "LGPL-2.1-or-later"

PV = "2.31.0"

RPM_NAME = "libwnck-1-22-2.31.0-13.3.aarch64.rpm"
RPM_HASH = "1cedca9fc8f962f27ebfaa83dfe1d5729837f13414ecb29e36db702124768f52888c76fef43a534cbd30412e3e724f203086475d1b902fc620e986550edab3a1"

RPROVIDES:${PN} += "libwnck-1-22 \
libwnck-1.so.22 \
libwnck2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXRes.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libstartup-notification-1.so.0"

inherit rpm
