SUMMARY = "MariaDB back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for MariaDB."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_mysql4_0-4.0.2-4.5.aarch64.rpm"
RPM_HASH = "eaf2c2555ea4200f753c1c7555198694860be8f07bd7230927e6a6c9bf9114925a2e1d1efa1bf5e9bc6bb2a05148ac6a251ca09496cd6a6d2bffc1ac2e386501"

RPROVIDES:${PN} += "libsoci-mysql.so.4.0 \
libsoci-mysql4-0 \
libsoci4-0-backend"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmariadb.so.3 \
libsoci-core.so.4.0 \
libstdc++.so.6"

inherit rpm
