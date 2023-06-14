SUMMARY = "OpenGL window and compositing manager configuration utilities"
DESCRIPTION = "This package contains GNOME/MATE based configuration utilities for \
the Compiz compositing manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-gnome-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "23b64bec31d58bd3497142f8fd2f5e902ddedd87e12e48b4f8b6b9f234fd4d45a7c8d4f8bcd4902dbda5a583c6f8a6d2de8a939dd8323c004149b678a4a34a6a"

RPROVIDES:${PN} += "compiz-decorator \
compiz-gnome \
compiz-mate"

RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXrender.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libdecoration.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmarco-private.so.2 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
