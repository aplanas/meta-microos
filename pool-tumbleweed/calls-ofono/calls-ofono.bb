SUMMARY = "Ofono support for calls"
DESCRIPTION = "Ofono support for calls. \
 \
This package is not recommended, only install if you are sure you \
want ofono support."
LICENSE = "GPL-3.0-only & MIT"

PV = "44.1"

RPM_NAME = "calls-ofono-44.1-1.1.aarch64.rpm"
RPM_HASH = "b53fbbddfdb142907c139cc1403fd1b862b18b1884dff278bf7b5f4fe1b5a2170a9c806c3b1f77ced4f9cac0edd54fb4262066616abd84728e35b602305e037a"

RPROVIDES:${PN} += "calls-ofono \
libofono.so"

RDEPENDS:${PN} += "calls \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
