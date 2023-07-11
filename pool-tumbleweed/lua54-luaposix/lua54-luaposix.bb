SUMMARY = "POSIX library for Lua"
DESCRIPTION = "This is a POSIX library for Lua which provides access to many POSIX features \
to Lua programs."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "lua54-luaposix-35.1-2.3.aarch64.rpm"
RPM_HASH = "6d871d56b410942a1013cbe6f6fbcf54b76dcfd078fbbfff67453c6848d2e101025ec6316f62780ad06508e66e0ec7277a07080e7d7e4b164d56dd9fc8a2345f"

RPROVIDES:${PN} += "libgen.so \
lua-luaposix \
lua54-luaposix"

RDEPENDS:${PN} += "libc.so.6 \
libcrypt.so.1 \
lua54"

inherit rpm
