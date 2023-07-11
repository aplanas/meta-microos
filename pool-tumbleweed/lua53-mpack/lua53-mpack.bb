SUMMARY = "Implementation of MessagePack for Lua 5.1"
DESCRIPTION = "mpack is a binary serialization/RPC library that implements both the msgpack \
and msgpack-rpc specifications."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "lua53-mpack-1.0.6-5.3.aarch64.rpm"
RPM_HASH = "c45ccf93a4bfff47715ad5aa72812c1058fcb7437dcdaf7c4124586780b45ec9f492dbb562c62495d479a63bafc5355ffd0607072939ae8412482c305387d354"

RPROVIDES:${PN} += "lua53-mpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
lua53"

inherit rpm
