SUMMARY = "Development files for MySQL Connector/C++"
DESCRIPTION = "MySQL Connector/C++ API is a MySQL database connector for C++ development. The \
MySQL driver for C++ can be used to connect to MySQL from C++ applications. The \
driver mimics the JDBC 4.0 API. It implements a significant subset of JDBC 4.0. \
 \
The Driver for C++ is designed to work best with MySQL 5.1 or later. Note - its \
full functionality is not available when connecting to MySQL 5.0. You cannot \
connect to MySQL 4.1 or earlier."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.32"

RPM_NAME = "libmysqlcppconn-devel-8.0.32-1.3.aarch64.rpm"
RPM_HASH = "0f8f2ec0982cadb041050f1f370c1f4edd4aec16069a916f82a82768e0dd4488f6d0b91e2c7c493848dd3d0b4ace312fbbdff32fc576b8f08a154d4a5a5fe2e2"

RPROVIDES:${PN} += "libmysqlcppconn-devel \
libmysqlcppconn-devel(aarch-64) \
mysql-connector-c++-devel"
RDEPENDS:${PN} += "libboost_headers-devel \
libmysqlcppconn9"

inherit rpm
