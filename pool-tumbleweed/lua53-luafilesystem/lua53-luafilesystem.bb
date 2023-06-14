SUMMARY = "Filesystem support for Lua"
DESCRIPTION = "LuaFileSystem is a Lua library developed to complement the set of functions \
related to file systems offered by the standard Lua distribution. \
 \
LuaFileSystem offers a portable way to access the underlying directory \
structure and file attributes."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "lua53-luafilesystem-1.8.0-6.2.aarch64.rpm"
RPM_HASH = "bba5f3d001f7c34012b5dd00a02f091f787f2af467660ad723e8b4f4f0b57b7b3c1d54d508e5bc11a493e4e7beafddf756fac7b891e65dc69367f54d44aacb7d"

RPROVIDES:${PN} += "lua53-luafilesystem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
lua53"

inherit rpm
