SUMMARY = "Library for Parsing Excel (XLS) Files"
DESCRIPTION = "libxlsreader is a C library which can read Excel (xls) files since Excel \
97 (the BIFF8 format). libxlsreader cannot write Excel files."
LICENSE = "BSD-2-Clause"

PV = "1.6.2"

RPM_NAME = "libxlsreader8-1.6.2-3.6.aarch64.rpm"
RPM_HASH = "55a8f3f5f19046eeb8ee581d9332f44e6feb6a80bf14605346c374cffd7e93b978bdb162763232850ed981584378003d77473ba8aebc813115beacd92793213f"

RPROVIDES:${PN} += "libxlsreader.so.8 \
libxlsreader8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
