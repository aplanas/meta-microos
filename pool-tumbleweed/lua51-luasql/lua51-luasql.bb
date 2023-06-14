SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "lua51-luasql-2.6.0-1.3.aarch64.rpm"
RPM_HASH = "f8434a74f882a434b673f0c7c122725a35f1bcb4835b8878b79546f530b59abd49e5580a68d83b6d2a7689396d3d79bfdbe46dd2683ce24f70ed088591b2edcd"

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
