SUMMARY = "GTK+3 timezone map widget"
DESCRIPTION = "Timezone map widget for GTK+3."
LICENSE = "GPL-3.0-only"

PV = "0.4.4"

RPM_NAME = "libtimezonemap1-0.4.4-2.10.aarch64.rpm"
RPM_HASH = "07e902fd32f0c6dddaa88d6559447b90120673eca6617e5a5e5652cc57339ed6e337c833478e6dd006be0f67deefd5c52d3a4621b3d2ad1721210c8e44b788fb"

RPROVIDES:${PN} += "libtimezonemap.so.1 \
libtimezonemap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libsoup-2.4.so.1"

inherit rpm
