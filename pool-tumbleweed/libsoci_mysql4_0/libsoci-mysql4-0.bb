SUMMARY = "MariaDB back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for MariaDB."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_mysql4_0-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "715c39322a654c2301676e10483673b99c2f2e34eca053837e436bbd752ecd7ff8f1462327cf4ea41db774885680393c87ba2f40eeff3ef4eba838d7c1af8929"

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
