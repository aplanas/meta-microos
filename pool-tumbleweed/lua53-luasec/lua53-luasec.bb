SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "lua53-luasec-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "abfb05e33e1237708d51ec0a7dfec9a77b1e1e0b3594abef37893a9a1114d9937995adac29380d3d6d6c28f352c786ec02be7015b837cfe98cdf1a8541e67849"

RPROVIDES:${PN} += "lua53-luasec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
lua53 \
lua53-luasocket"

inherit rpm
