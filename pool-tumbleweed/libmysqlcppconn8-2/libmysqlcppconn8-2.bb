SUMMARY = "MySQL Connector/C++: Standardized database driver for C++ development"
DESCRIPTION = "MySQL Connector/C++ 8.0 implements the X DevAPI. The X DevAPI allows one to work \
with MySQL Servers implementing a document store via the X Plugin. One can also \
execute plain SQL queries using this API. \
 \
The Driver for C++ is designed to work best with MySQL 5.1 or later. Note - its \
full functionality is not available when connecting to MySQL 5.0. You cannot \
connect to MySQL 4.1 or earlier."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.32"

RPM_NAME = "libmysqlcppconn8-2-8.0.32-1.3.aarch64.rpm"
RPM_HASH = "b66a459bcb5f18a0fa255fb6098c8d509ddbb7394e86390e13cf95bbfde1747fb38de5e08aa7e69b5ad1f0c2b0f484ba395439a7ad4baf0f86d518fa72078a70"

RPROVIDES:${PN} += "libmysqlcppconn8-2 \
libmysqlcppconn8-2(aarch-64) \
libmysqlcppconn8.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libresolv.so.2()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
