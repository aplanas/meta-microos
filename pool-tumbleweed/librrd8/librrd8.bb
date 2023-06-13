SUMMARY = "Round Robin Database tool library"
DESCRIPTION = "RRD stands for Round Robin Database. RRD is a system to store and \
display time-series data."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "librrd8-1.8.0-3.1.aarch64.rpm"
RPM_HASH = "f43a1b49b549dae15d45f807cae304f5ac4fa1d53c6da6f75d737cf75e8277c403a72b74de643e661090864d6451e007a08880e9e9dfbc980b35bde14207ec39"

RPROVIDES:${PN} += "librrd.so.8()(64bit) \
librrd8 \
librrd8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdbi.so.3()(64bit) \
libdbi.so.3(ABI_3)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.17)(64bit)"

inherit rpm
