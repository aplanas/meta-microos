SUMMARY = "Library for Parsing Excel (XLS) Files"
DESCRIPTION = "libxlsreader is a C library which can read Excel (xls) files since Excel \
97 (the BIFF8 format). libxlsreader cannot write Excel files."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "libxlsreader8-1.6.2-3.5.aarch64.rpm"
RPM_HASH = "d10bd0f8222a36c75336612be6dbc41bdaf70a700c494ac03eeffdcc813a299af581a92affd26cfbedeaa0f67de409ec19a3576400d93272ddfcc1a556171fc3"

RPROVIDES:${PN} += "libxlsreader.so.8()(64bit) \
libxlsreader8 \
libxlsreader8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
