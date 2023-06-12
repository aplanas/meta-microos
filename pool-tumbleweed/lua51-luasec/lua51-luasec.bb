SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "lua51-luasec-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "ff0486340ec2ce2df53e291814a70fe195a978f4b2a2a3dcb13dce6c397448d2df03381747a3771de73a5976e8ac8c646947d25673b191c8ae7f20e1bcd7d6d6"

RPROVIDES:${PN} += "lua51-luasec \
lua51-luasec(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
lua51 \
lua51-luasocket"

inherit rpm
