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

RPM_NAME = "lua51-luadbi-0.7.2-2.11.aarch64.rpm"
RPM_HASH = "9a4b72cbc8110c65d653d7e1d27bf676a062a59c7c87e48004762ea1e6a96339ad334589a4552d6ef96cded42ca5b93fda7666640e996e401dc05d7fe2610c77"

RPROVIDES:${PN} += "lua51-luadbi \
lua51-luadbi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libpq.so.5()(64bit) \
libsqlite3.so.0()(64bit) \
lua51"

inherit rpm
