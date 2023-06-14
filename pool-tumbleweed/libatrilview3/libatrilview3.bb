SUMMARY = "System library of the MATE Document Viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and \
singlepage document formats like PDF and PostScript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "libatrilview3-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "f3e3694818771615821a7532ae441701b6b37836e1bcc668f4b7fd4993940fcc171b9e799c34afb5794a9217638ec64f4c0422f3996efe0d7c3fe4628d5c2926"

RPROVIDES:${PN} += "libatrilview.so.3 \
libatrilview3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libatrildocument.so.3 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libwebkit2gtk-4.0.so.37"

inherit rpm
