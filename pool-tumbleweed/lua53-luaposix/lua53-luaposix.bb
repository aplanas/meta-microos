SUMMARY = "POSIX library for Lua"
DESCRIPTION = "This is a POSIX library for Lua which provides access to many POSIX features \
to Lua programs."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "lua53-luaposix-35.1-2.3.aarch64.rpm"
RPM_HASH = "42d57fb353a642b23f9fa6d5d7c7b8da20f692ab6119da1e952e17988ad1905f481f67b138724f8a73d709e3fa6b15ef655b7475fa50a5ba748a171bcd553647"

RPROVIDES:${PN} += "libgen.so \
lua53-luaposix"

RDEPENDS:${PN} += "libc.so.6 \
libcrypt.so.1 \
lua53"

inherit rpm
