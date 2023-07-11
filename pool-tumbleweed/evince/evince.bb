SUMMARY = "GNOME Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript. \
 \
Separate plugin packages, e.g. evince-plugin-pdfdocument, need to be present \
for certain formats to be recognized."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "evince-44.3-1.1.aarch64.rpm"
RPM_HASH = "4ca7f395651b6fe8bffb316629386f2a924481f6e150a2f5e5bf1be32f47e5dc04a7ee8271093e5cd47fdb0e19fb30bc7ffae276d08ad30babcc634fd793700a"

RPROVIDES:${PN} += "evince \
evince-browser-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libevdocument3.so.4 \
libevview3.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsecret-1.so.0"

inherit rpm
