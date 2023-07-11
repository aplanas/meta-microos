SUMMARY = "GLib wrapper library around libgit2"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libgit2-glib-1_0-0-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "9369977ee55e9b3b32e877f1f876c171be4b0705b64f23248bba82dbffbf13df2cdf9983609168054b646e0876b38861b719d0c1173be4cd707c18fe19680e8b"

RPROVIDES:${PN} += "libgit2-glib-1-0-0 \
libgit2-glib-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgit2.so.1.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
