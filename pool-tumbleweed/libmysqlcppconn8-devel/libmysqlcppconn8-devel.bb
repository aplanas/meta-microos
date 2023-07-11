SUMMARY = "Development files for MySQL Connector/C++"
DESCRIPTION = "MySQL Connector/C++ 8.0 implements the X DevAPI. The X DevAPI allows one to work \
with MySQL Servers implementing a document store via the X Plugin. One can also \
execute plain SQL queries using this API. \
 \
The Driver for C++ is designed to work best with MySQL 5.1 or later. Note - its \
full functionality is not available when connecting to MySQL 5.0. You cannot \
connect to MySQL 4.1 or earlier."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.33"

RPM_NAME = "libmysqlcppconn8-devel-8.0.33-1.1.aarch64.rpm"
RPM_HASH = "7c244dd21242d9617cc830d781e8cce7f6c448ca836aa1d6223a26be5e258a04de0c21f87763a5bcebabc6aeebcd165462ab43cfeaa9069e7c77b1f2d1e9a0bf"

RPROVIDES:${PN} += "libmysqlcppconn8-devel \
mysql-connector-c++-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
libmysqlcppconn8-2"

inherit rpm
