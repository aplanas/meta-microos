SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "lua51-luasql-2.6.0-1.4.aarch64.rpm"
RPM_HASH = "ddd11adbcbe6763007b771af1c18fe5e8fbb19aaa8c9b5bd9c37117521a356657a5e4da9f25dfc814fa7bca63a44166dfca1104be1860b4e1ee58ed5d6f72f4d"

RPROVIDES:${PN} += "lua51-luasql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiodbc.so.2 \
libmariadb.so.3 \
libmariadb3 \
libpq.so.5 \
libsqlite3.so.0 \
lua51"

inherit rpm
