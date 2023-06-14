SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "lua53-luasql-2.6.0-1.3.aarch64.rpm"
RPM_HASH = "76de4a9e56f361c59c6e2e4587cb73736511545208cfa179995c1cc1b0fc8bf7b405a3afd5c82b79091fc7568bd487b1fd71f49de1481888d7222d625a895d58"

RPROVIDES:${PN} += "lua53-luasql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiodbc.so.2 \
libmariadb.so.3 \
libmariadb3 \
libpq.so.5 \
libsqlite3.so.0 \
lua53"

inherit rpm
