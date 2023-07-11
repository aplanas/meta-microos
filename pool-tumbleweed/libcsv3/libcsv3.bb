SUMMARY = "Library to Read and Write CSV Data"
DESCRIPTION = "libcsv is a CSV library written in ANSI C89 that can read and write \
CSV data. It provides an interface using callback functions to handle \
parsed fields and rows and can parse improperly formatted CSV files."
LICENSE = "LGPL-2.1+"

PV = "3.0.3"

RPM_NAME = "libcsv3-3.0.3-2.25.aarch64.rpm"
RPM_HASH = "b604002838a66539bd7dc98909a9c7fed57e5e0eec69914cfb9d3f8b493df0e1826952fee7067e8bee180bc20848c47db64b47f0e1b1da29b47a0ad460379607"

RPROVIDES:${PN} += "libcsv.so.3 \
libcsv3"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
