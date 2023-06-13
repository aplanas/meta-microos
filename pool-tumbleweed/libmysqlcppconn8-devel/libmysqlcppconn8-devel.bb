SUMMARY = "Development files for MySQL Connector/C++"
DESCRIPTION = "MySQL Connector/C++ 8.0 implements the X DevAPI. The X DevAPI allows one to work \
with MySQL Servers implementing a document store via the X Plugin. One can also \
execute plain SQL queries using this API. \
 \
The Driver for C++ is designed to work best with MySQL 5.1 or later. Note - its \
full functionality is not available when connecting to MySQL 5.0. You cannot \
connect to MySQL 4.1 or earlier."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.32"

RPM_NAME = "libmysqlcppconn8-devel-8.0.32-1.3.aarch64.rpm"
RPM_HASH = "b00c6c570e52f52b9b535d8aa0525c759341928408e95751f57da6387c55f52f1db8e2289d66f575a4595cc5d2d2d09913bf51696623e5394cfdb460fdfcb79f"

RPROVIDES:${PN} += "libmysqlcppconn8-devel \
libmysqlcppconn8-devel(aarch-64) \
mysql-connector-c++-devel"

RDEPENDS:${PN} += "libboost_headers-devel \
libmysqlcppconn8-2"

inherit rpm
