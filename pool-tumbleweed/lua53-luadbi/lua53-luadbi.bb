SUMMARY = "A database interface library for Lua"
DESCRIPTION = "LuaDBI is a database interface library for Lua. It is designed to provide a \
RDBMS agnostic API for handling database operations. LuaDBI also provides \
support for prepared statement handles, placeholders and bind parameters for \
all database operations. \
 \
Currently LuaDBI supports DB2, Oracle, MySQL, PostgreSQL and SQLite databases \
with native database drivers. But openSUSE version doesn't build with DB2 and \
Oracle."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "lua53-luadbi-0.7.2-2.11.aarch64.rpm"
RPM_HASH = "287a34fbe0383cefdbbf38244327e999f27654c73aa281c6b372acb67a569c7f1278ea91f76c7f096f6fe20d41b44f98d0ccd9274286de56ae048cc298225314"

RPROVIDES:${PN} += "lua53-luadbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
libpq.so.5 \
libsqlite3.so.0 \
lua53"

inherit rpm
