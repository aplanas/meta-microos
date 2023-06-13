SUMMARY = "GNOME Document Viewer System Library"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libevview3-3-44.1-1.1.aarch64.rpm"
RPM_HASH = "3e7068b243341537bc732b1e7dcf3ba9dce12ee717aaafc380fb6b31c1ddf95151929207d096985e01ecbc04b0651a4f51afffd34ca715a4ecdc3baa69af1885"

RPROVIDES:${PN} += "libevview3-3 \
libevview3-3(aarch-64) \
libevview3.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libevdocument3.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
