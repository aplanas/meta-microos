SUMMARY = "MariaDB connector in C"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. This is a different \
implementation from the traditional libmariadbclient/libmysqlclient \
that is shipped with mariadb-server/mysql-server, but the API is the same. \
 \
This package holds the runtime components."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "libmariadb3-3.3.5-1.1.aarch64.rpm"
RPM_HASH = "9fc5960983f6b8baefda2dca97678fe8114548ce12b56956ca93b822a23c6198323aa1f4dd673720e234a02a5cd9fc5fde9524946bcf2eff06f36f6e597616ce"

RPROVIDES:${PN} += "libmariadb.so.3 \
libmariadb3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
