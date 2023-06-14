SUMMARY = "GNOME Document Viewer System Library"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libevview3-3-44.1-1.1.aarch64.rpm"
RPM_HASH = "3e7068b243341537bc732b1e7dcf3ba9dce12ee717aaafc380fb6b31c1ddf95151929207d096985e01ecbc04b0651a4f51afffd34ca715a4ecdc3baa69af1885"

RPROVIDES:${PN} += "libevview3-3 \
libevview3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
