SUMMARY = "MySQL Connector/C++: Standardized database driver for C++ development"
DESCRIPTION = "MySQL Connector/C++ is a MySQL database connector for C++ development. The \
MySQL driver for C++ can be used to connect to MySQL from C++ applications. The \
driver mimics the JDBC 4.0 API. It implements a significant subset of JDBC 4.0. \
 \
The Driver for C++ is designed to work best with MySQL 5.1 or later. Note - its \
full functionality is not available when connecting to MySQL 5.0. You cannot \
connect to MySQL 4.1 or earlier."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.32"

RPM_NAME = "libmysqlcppconn9-8.0.32-1.3.aarch64.rpm"
RPM_HASH = "6e701c78feb8b089439ffb2ed9abd40a95b7ca63cdcc46c8fb2c3ccd3d52ef97f77ec3cda3c9b94ac36a092734f172faf02fdaf4f68896c2b63f5e4b30abae12"

RPROVIDES:${PN} += "libmysqlcppconn.so.9()(64bit) \
libmysqlcppconn9 \
libmysqlcppconn9(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
