SUMMARY = "Filesystem support for Lua"
DESCRIPTION = "LuaFileSystem is a Lua library developed to complement the set of functions \
related to file systems offered by the standard Lua distribution. \
 \
LuaFileSystem offers a portable way to access the underlying directory \
structure and file attributes."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "lua51-luafilesystem-1.8.0-6.2.aarch64.rpm"
RPM_HASH = "df0376cb59699e631b8dc89c3a830cd068fa58a193bca217526e4628a358c2a1e8e58bb8e1d8ca923dc02660135197aef4ad72b0b8aaeaa8f25c041c9ddc249c"

RPROVIDES:${PN} += "lua51-luafilesystem \
lua51-luafilesystem(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
lua51"

inherit rpm
