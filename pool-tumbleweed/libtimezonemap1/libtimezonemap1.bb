SUMMARY = "GTK+3 timezone map widget"
DESCRIPTION = "Timezone map widget for GTK+3."
LICENSE = "GPL-3.0-only"

PV = "0.4.4"

RPM_NAME = "libtimezonemap1-0.4.4-2.9.aarch64.rpm"
RPM_HASH = "e30f688d4f6b93d9ab16e1430bebfc74ad31489c49f285274be8496ddc84c18b153d477c3bbf8d555a120b011f03ad09c35f86c1e59b629f221a371b8b752e99"

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
