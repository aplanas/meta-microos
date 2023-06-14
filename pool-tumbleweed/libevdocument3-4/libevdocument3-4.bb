SUMMARY = "GNOME Document Viewer System Library"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libevdocument3-4-44.1-1.1.aarch64.rpm"
RPM_HASH = "dd2e6040a4c83b25ad7b88e629c2ccd1808735d0a536130c23aa1b47049d72b46f05a0004f867a9c44223d476b12daf6b6b51cace8378e7ce8d31cd582ede713"

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
