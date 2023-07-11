SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "lua53-luasql-2.6.0-1.4.aarch64.rpm"
RPM_HASH = "1f3bddd2276f434b15b2f96426f00bfa57e16502f106871a0f556addb9a41859cadadc56fde96d4899328093aca5d717e3e64829e7673181ad0a5819a607ce6e"

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
