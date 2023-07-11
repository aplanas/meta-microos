SUMMARY = "MySQL Connector/C++: Standardized database driver for C++ development"
DESCRIPTION = "MySQL Connector/C++ 8.0 implements the X DevAPI. The X DevAPI allows one to work \
with MySQL Servers implementing a document store via the X Plugin. One can also \
execute plain SQL queries using this API. \
 \
The Driver for C++ is designed to work best with MySQL 5.1 or later. Note - its \
full functionality is not available when connecting to MySQL 5.0. You cannot \
connect to MySQL 4.1 or earlier."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "8.0.33"

RPM_NAME = "libmysqlcppconn8-2-8.0.33-1.1.aarch64.rpm"
RPM_HASH = "d562d47f5f6c9ed0b4e665ccbfb103fa41a1a49608f241d83bb2b5f9157bbe3de8669bc85db98ecf440d2dd05bd42f4e096d91888e9593df57c53d9b68a16357"

RPROVIDES:${PN} += "libmysqlcppconn8-2 \
libmysqlcppconn8.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libresolv.so.2 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
