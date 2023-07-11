SUMMARY = "GLib-based library for accessing online service APIs using the GData protocol"
DESCRIPTION = "libgdata is a GLib-based library for accessing online service APIs using \
the GData protocol — most notably, Google's services. It provides APIs \
to access the common Google services, and has full asynchronous support."
LICENSE = "LGPL-2.1-or-later"

PV = "0.18.1"

RPM_NAME = "libgdata22-0.18.1-3.4.aarch64.rpm"
RPM_HASH = "317dc9e946376951c2a8c8e6f2623df4912d7d0e678fc35d473c480674f61b17cf6f7e82d71b0772b25a5b947215126d55eedfe189f196de98c3dd509a58e201"

RPROVIDES:${PN} += "libgdata \
libgdata.so.22 \
libgdata22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1 \
libxml2.so.2"

inherit rpm
