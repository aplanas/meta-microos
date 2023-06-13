SUMMARY = "ODBC back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for unixODBC."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_odbc4_0-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "1b71cf3803e433e9d1f9322a33105e08d30a37a067ca158ddd57dc1dbfdf43caaf38218aa0cd4df77456e82730f865dc873b041daaaa389e4119036be67e1320"

RPROVIDES:${PN} += "libsoci4_0-backend \
libsoci_odbc.so.4.0()(64bit) \
libsoci_odbc4_0 \
libsoci_odbc4_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libodbc.so.2()(64bit) \
libsoci_core.so.4.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
