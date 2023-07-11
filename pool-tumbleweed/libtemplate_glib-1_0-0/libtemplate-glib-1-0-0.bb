SUMMARY = "Library for generating text based on a template and user defined state"
DESCRIPTION = "Template-GLib is a library for generating text based on a template and \
user defined state. Template-GLib does not use a language runtime, so it is \
safe to use from any GObject-Introspectable language."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.1"

RPM_NAME = "libtemplate_glib-1_0-0-3.36.1-1.4.aarch64.rpm"
RPM_HASH = "a5e274e26b38fa6a08bce93989cdef0143d9b5252fbba81d6fc051ac93ecb618449e86e2c572a54dfa03bbd249c1058a9b80e6b21b58ea238d97762101c7e70f"

RPROVIDES:${PN} += "libtemplate-glib-1-0-0 \
libtemplate-glib-1.0.so.0 \
template-glib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
