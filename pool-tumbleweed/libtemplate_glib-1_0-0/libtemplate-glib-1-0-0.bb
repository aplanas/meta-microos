SUMMARY = "Library for generating text based on a template and user defined state"
DESCRIPTION = "Template-GLib is a library for generating text based on a template and \
user defined state. Template-GLib does not use a language runtime, so it is \
safe to use from any GObject-Introspectable language."
LICENSE = "LGPL-2.1-or-later"

PV = "3.36.1"

RPM_NAME = "libtemplate_glib-1_0-0-3.36.1-1.3.aarch64.rpm"
RPM_HASH = "b7d6d3ce2ad18e9d46048ddc6460527e416c5085db00b01b86ac028781da7dd689d8c6a73a3f33504203e2bede5daf8e908831dad1d5830b25601d98e8b1025f"

RPROVIDES:${PN} += "libtemplate_glib-1.0.so.0()(64bit) \
libtemplate_glib-1_0-0 \
libtemplate_glib-1_0-0(aarch-64) \
template-glib"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm