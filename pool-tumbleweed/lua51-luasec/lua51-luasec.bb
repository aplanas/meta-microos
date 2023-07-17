SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "lua51-luasec-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "c7c867a0e9825fa7e3a816359bb36fd226b3bf38b1259dea780a5ece3fcd61a8a99a1bed2043dc0b36a682bd73ccf3f9e595a0f32df2e4ee493a2b984ab3457e"

RPROVIDES:${PN} += "lua51-luasec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
lua51 \
lua51-luasocket"

inherit rpm
