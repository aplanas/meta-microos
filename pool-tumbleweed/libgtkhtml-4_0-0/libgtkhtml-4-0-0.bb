SUMMARY = "Lightweight HTML rendering/printing/editing engine"
DESCRIPTION = "GtkHTML is a lightweight HTML rendering/printing/editing engine. It \
was originally based on KHTMLW, part of the KDE project, but is now \
being developed independently."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "libgtkhtml-4_0-0-4.10.0-7.3.aarch64.rpm"
RPM_HASH = "4bc6774389479583878f0248b2bda9f101087907e4d0279806f93c1e63d5bd283bfbc0db6721f09778024e93b767d16c9fdb7da3cc29fd016cd28c5d603de3b5"

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
