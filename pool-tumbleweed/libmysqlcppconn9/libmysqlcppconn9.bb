SUMMARY = "MySQL Connector/C++: Standardized database driver for C++ development"
DESCRIPTION = "MySQL Connector/C++ is a MySQL database connector for C++ development. The \
MySQL driver for C++ can be used to connect to MySQL from C++ applications. The \
driver mimics the JDBC 4.0 API. It implements a significant subset of JDBC 4.0. \
 \
The Driver for C++ is designed to work best with MySQL 5.1 or later. Note - its \
full functionality is not available when connecting to MySQL 5.0. You cannot \
connect to MySQL 4.1 or earlier."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.33"

RPM_NAME = "libmysqlcppconn9-8.0.33-1.1.aarch64.rpm"
RPM_HASH = "9c47c2f43102cd572610bcc38cfee512d29f2a41a879a6c0d01548641bb1255e216f35cd57dc34b9eec37f025ab3a514e03e038c5ceb58c8217e5ad99d1e471c"

RPROVIDES:${PN} += "libmysqlcppconn.so.9 \
libmysqlcppconn9"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
