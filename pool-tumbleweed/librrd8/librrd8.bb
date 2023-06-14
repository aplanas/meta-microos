SUMMARY = "Round Robin Database tool library"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "librrd8-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "f43a1b49b549dae15d45f807cae304f5ac4fa1d53c6da6f75d737cf75e8277c403a72b74de643e661090864d6451e007a08880e9e9dfbc980b35bde14207ec39"

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
