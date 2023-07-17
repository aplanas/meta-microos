SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "lua54-luasec-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "863e816654102778318b16cd75bc34a1b48bc12f21687d841915567766d9bdbfb4651a5101087c218da70e419c8ea74a2a73d240ca2df2f1a2bae4ffce694fb4"

RPROVIDES:${PN} += "lua-luasec \
lua54-luasec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
lua54 \
lua54-luasocket"

inherit rpm
