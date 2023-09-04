SUMMARY = "PDF document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read PDF documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-plugin-pdfdocument-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "df376e4f527fd562b9e7387e3ecc4cf6d26978713bd6fe47ffc7fa77ee319bc4e2d24df2ac096723540e100400da4839c9c9844371313e3aefe3c05888ff3f03"

RPROVIDES:${PN} += "libpdfdocument.so \
xreader-plugin-pdfdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpoppler-glib.so.8 \
libxml2.so.2 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
