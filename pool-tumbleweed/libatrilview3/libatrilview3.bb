SUMMARY = "System library of the MATE Document Viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and \
singlepage document formats like PDF and PostScript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "libatrilview3-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "f3e3694818771615821a7532ae441701b6b37836e1bcc668f4b7fd4993940fcc171b9e799c34afb5794a9217638ec64f4c0422f3996efe0d7c3fe4628d5c2926"

RPROVIDES:${PN} += "libatrilview.so.3()(64bit) \
libatrilview3 \
libatrilview3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libatrildocument.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit)"

inherit rpm
