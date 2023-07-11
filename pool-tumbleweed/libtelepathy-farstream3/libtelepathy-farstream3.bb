SUMMARY = "Telepathy library to handle Call channels"
DESCRIPTION = "Telepathy Farstream is a Telepathy client library that uses Farsight2 \
to handle Call channels."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "libtelepathy-farstream3-0.6.2-2.24.aarch64.rpm"
RPM_HASH = "eea2535fed516e4cc818621b9bcc9f56468232f49cc640716883552d023b44292aa412f70dd8b90dc03a32669e223baad0ac4e368996ea0f2bf3ff53579c38b7"

RPROVIDES:${PN} += "libtelepathy-farstream.so.3 \
libtelepathy-farstream3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libfarstream-0.2.so.5 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libtelepathy-glib.so.0"

inherit rpm
