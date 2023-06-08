SUMMARY = "OpenGL window and compositing manager configuration utilities"
DESCRIPTION = "This package contains GNOME/MATE based configuration utilities for \
the Compiz compositing manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-gnome-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "23b64bec31d58bd3497142f8fd2f5e902ddedd87e12e48b4f8b6b9f234fd4d45a7c8d4f8bcd4902dbda5a583c6f8a6d2de8a939dd8323c004149b678a4a34a6a"

RPROVIDES:${PN} += "compiz-decorator compiz-gnome compiz-gnome(aarch-64) compiz-mate"
RDEPENDS:${PN} += "compiz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXi.so.6()(64bit) libXrender.so.1()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdbus-glib-1.so.2()(64bit) libdecoration.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmarco-private.so.2()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libwnck-3.so.0()(64bit)"

inherit rpm
