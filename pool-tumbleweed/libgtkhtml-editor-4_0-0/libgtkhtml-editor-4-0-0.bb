SUMMARY = "Lightweight HTML rendering/printing/editing engine"
DESCRIPTION = "GtkHTML is a lightweight HTML rendering/printing/editing engine. It \
was originally based on KHTMLW, part of the KDE project, but is now \
being developed independently."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "libgtkhtml-editor-4_0-0-4.10.0-7.4.aarch64.rpm"
RPM_HASH = "60e4b6ff0acf7cef4f1efc48e5035b182f4729b9319e8022c25a72fbd1d67fa0ad951ad69d9e7514963913b9652d30c772ece14b7c8a95daed73046471de16f0"

RPROVIDES:${PN} += "libgtkhtml-editor-4-0-0 \
libgtkhtml-editor-4.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libenchant.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkhtml-4.0.so.0"

inherit rpm
