SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "lua54-luasql-2.6.0-1.4.aarch64.rpm"
RPM_HASH = "65f5226f7e833ddec22322108e25014efe326b5bdc94c75dd3d7ff3571e54e4cd1468da0cf713e04efb6f9aa0950030d0ffa1689b20d4f70fbee52cfb2462746"

RPROVIDES:${PN} += "lua-luasql \
lua54-luasql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiodbc.so.2 \
libmariadb.so.3 \
libmariadb3 \
libpq.so.5 \
libsqlite3.so.0 \
lua54"

inherit rpm
