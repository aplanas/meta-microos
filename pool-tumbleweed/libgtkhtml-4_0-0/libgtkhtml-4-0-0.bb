SUMMARY = "Lightweight HTML rendering/printing/editing engine"
DESCRIPTION = "GtkHTML is a lightweight HTML rendering/printing/editing engine. It \
was originally based on KHTMLW, part of the KDE project, but is now \
being developed independently."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "libgtkhtml-4_0-0-4.10.0-7.4.aarch64.rpm"
RPM_HASH = "1e5e1f4c2813ce8e25dddb4c6c24402a54de25c5945c4ee77dd621ddb97cbd4ac354359f631497ccd09e273461cf69e9301c4a2c2103f8687a1aa3bcb4e6f1e9"

RPROVIDES:${PN} += "gtkhtml \
gtkhtml-4-0 \
gtkhtml2 \
libgtkhtml-4-0-0 \
libgtkhtml-4.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
