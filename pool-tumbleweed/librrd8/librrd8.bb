SUMMARY = "Round Robin Database tool library"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "librrd8-1.8.0-3.5.aarch64.rpm"
RPM_HASH = "c3451fcca70dfe32efd1a83b5b49179f90c575535cc827a14a9b9e16b509d071303ee69e028f2f08719e8041646d3dcbd3a3d4b9bcf8c0b89f770337b0e60104"

RPROVIDES:${PN} += "librrd.so.8 \
librrd8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbi.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libxml2.so.2"

inherit rpm
