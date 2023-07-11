SUMMARY = "Development files for MySQL Connector/C++"
DESCRIPTION = "MySQL Connector/C++ API is a MySQL database connector for C++ development. The \
MySQL driver for C++ can be used to connect to MySQL from C++ applications. The \
driver mimics the JDBC 4.0 API. It implements a significant subset of JDBC 4.0. \
 \
The Driver for C++ is designed to work best with MySQL 5.1 or later. Note - its \
full functionality is not available when connecting to MySQL 5.0. You cannot \
connect to MySQL 4.1 or earlier."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.33"

RPM_NAME = "libmysqlcppconn-devel-8.0.33-1.1.aarch64.rpm"
RPM_HASH = "a2b94c8b995562c7dcc889f24d310f5d8e7b122fbe7368af42ccdf29d7b34f6cf10ad2546b5d5a1af299fc6664f416907164d933c58ac6424f00cc7069b8e8f7"

RPROVIDES:${PN} += "libmysqlcppconn-devel \
mysql-connector-c++-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
libmysqlcppconn9"

inherit rpm
