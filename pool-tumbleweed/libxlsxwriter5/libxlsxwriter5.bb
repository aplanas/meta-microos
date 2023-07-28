SUMMARY = "A C library for creating Excel XLSX files"
DESCRIPTION = "Libxlsxwriter is a C library for creating Excel XLSX files. \
 \
This package holds the shared library files."
LICENSE = "BSD-2-Clause"

PV = "1.1.5"

RPM_NAME = "libxlsxwriter5-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "955f4a791c14936a981cf9b568fe88f5a83f4924ca7cf563e5f6505dbffec6f74742f4e66eb1eee19cbcbcc359a95ebd5f433edb645e5d72188805f253c1e383"

RPROVIDES:${PN} += "libxlsxwriter.so.5 \
libxlsxwriter5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libz.so.1"

inherit rpm
