SUMMARY = "GObject wrapper for libical library"
DESCRIPTION = "This package provides a GObject wrapper for libical library with support \
for GObject Introspection."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-glib3-3.0.16-1.4.aarch64.rpm"
RPM_HASH = "9f1c9be1780ee537de618dfb34d5970749f32efb8ad4bc82ce58033492dea8d865d180a0a5cb73f2836c9173ee2e31122fa8980ce46c8c5d7b168854245b6dc3"

RPROVIDES:${PN} += "libical-glib \
libical-glib.so.3 \
libical-glib3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libical.so.3"

inherit rpm
