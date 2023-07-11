SUMMARY = "ODBC back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for unixODBC."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_odbc4_0-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "a37b4823a61bcad72879cf9c109dc7f50b7dc4d7fc991f48c309bb9bb0209c11e75701bf81e054a2e00d26e7fca73a9811ffab384dd1ff05bddd4b1a6378aa70"

RPROVIDES:${PN} += "libsoci-odbc.so.4.0 \
libsoci-odbc4-0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libodbc.so.2 \
libsoci-core.so.4.0 \
libstdc++.so.6"

inherit rpm
