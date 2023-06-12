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

RPM_NAME = "lua54-luadbi-0.7.2-2.11.aarch64.rpm"
RPM_HASH = "72375316710fa5fd8ad818640281087b62dcf1e19ff1b302c6406d3241a995c74f6f42b5ab48eea17f92c4e3d7730c4b2d3eaf1cfb816ca2c9b49d1734a04a19"

RPROVIDES:${PN} += "lua-luadbi \
lua54-luadbi \
lua54-luadbi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libpq.so.5()(64bit) \
libsqlite3.so.0()(64bit) \
lua54"

inherit rpm
