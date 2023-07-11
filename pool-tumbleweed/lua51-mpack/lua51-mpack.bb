SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "lua51-mpack-1.0.6-5.3.aarch64.rpm"
RPM_HASH = "1b8b4688b636d80fa58f6cb3b86d0c78baa80ee515a76091f44796c1ab3720d078d137520e45fb83394f0aa304390034835d752c70c3326be36568bcf578578e"

RPROVIDES:${PN} += "lua51-mpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
lua51"

inherit rpm
