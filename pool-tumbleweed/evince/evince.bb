SUMMARY = "GNOME Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript. \
 \
Separate plugin packages, e.g. evince-plugin-pdfdocument, need to be present \
for certain formats to be recognized."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-44.1-1.1.aarch64.rpm"
RPM_HASH = "f76943a41fb92ba61351b6091ef3f0d3d60b42d843025f71025577d6ff4d42658f21ce758d12ad81c7268f01b7de3c67e5598ab669b2d7a2a8b3e5e7a4ea4d31"

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
