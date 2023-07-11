SUMMARY = "Window Navigator Construction Kit (Library Package)"
DESCRIPTION = "The Window Navigator Construction Kit is a library that can be used to \
write task lists, pagers, and similar GNOME programs."
LICENSE = "LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "libwnck-3-0-43.0-3.4.aarch64.rpm"
RPM_HASH = "da7010325b90bb77458070e20f74b92dfc0d162981a609678dabcf48f8a2d66889c16c8955cb532929ea8074b5038d29ee6c1b3b9962246f189fd39552157ae9"

RPROVIDES:${PN} += "libwnck \
libwnck-3-0 \
libwnck-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXRes.so.1 \
libXrender.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libstartup-notification-1.so.0"

inherit rpm
