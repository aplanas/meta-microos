SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "lua54-mpack-1.0.6-5.3.aarch64.rpm"
RPM_HASH = "4470fe1b005bb99842701bd9e4c590619d04f70f4d550f98302aa938650e1090a597a7566eec8004148ce16f20ff9295f778f33943ca860b5ce0156e775610f3"

RPROVIDES:${PN} += "lua-mpack \
lua54-mpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
lua54"

inherit rpm
