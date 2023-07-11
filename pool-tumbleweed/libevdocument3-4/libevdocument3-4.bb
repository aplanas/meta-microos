SUMMARY = "GNOME Document Viewer System Library"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "libevdocument3-4-44.3-1.1.aarch64.rpm"
RPM_HASH = "6587036f0d6487dc03437501360b5fdbef32301d7c1d16174eeeea3116d278a9d16f0142ad05462c2f997f45608e4a949ac4ebeffae99810fba2f190cc4ffda0"

RPROVIDES:${PN} += "libevdocument3-4 \
libevdocument3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsynctex.so.2 \
libxml2.so.2"

inherit rpm
