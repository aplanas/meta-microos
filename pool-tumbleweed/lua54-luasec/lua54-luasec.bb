SUMMARY = "A Lua binding for OpenSSL"
DESCRIPTION = "It is a binding for OpenSSL library to provide TLS/SSL communication. \
It takes an already established TCP connection and creates a secure \
session between the peers."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "lua54-luasec-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "8a087a57621d2c738a2523ddcb18beaa6999059a906cdad3cb6dced51c8b246dc200a2bd9b782a93c74d2dc64be41767da47e7835767f1e2bb2b2b558c626c23"

RPROVIDES:${PN} += "lua-luasec \
lua54-luasec \
lua54-luasec(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit) \
lua54 \
lua54-luasocket"

inherit rpm
