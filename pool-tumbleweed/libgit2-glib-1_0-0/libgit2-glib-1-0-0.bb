SUMMARY = "GLib wrapper library around libgit2"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libgit2-glib-1_0-0-1.1.0-1.5.aarch64.rpm"
RPM_HASH = "a9101d8e61daee94a9239020b94ae9251aed0cc040e450e8abfbae410e9ac9f3e964b3b7a594862d9d55ad6c122e7952a084b4d69f9d0b0181347b180387006b"

RPROVIDES:${PN} += "libgit2-glib-1.0.so.0()(64bit) \
libgit2-glib-1_0-0 \
libgit2-glib-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libgit2.so.1.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
