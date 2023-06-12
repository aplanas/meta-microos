SUMMARY = "Crypto and SSL toolkit for Python"
DESCRIPTION = "M2Crypto is a crypto and SSL toolkit for Python featuring the following: \
 \
RSA, DSA, DH, HMACs, message digests, symmetric ciphers (including \
AES). SSL functionality to implement clients and servers. HTTPS \
extensions to Python's httplib, urllib, and xmlrpclib. Unforgeable \
HMAC'ing AuthCookies for web session management. FTP/TLS client and \
server. S/MIME. ZServerSSL: A HTTPS server for Zope. ZSmime: An S/MIME \
messenger for Zope."
LICENSE = "MIT"

PV = "0.38.0"

RPM_NAME = "python311-M2Crypto-0.38.0-6.3.aarch64.rpm"
RPM_HASH = "68d3e125b1badb6cb3b1bdf37e2d3058839a1827b4329d3c34cc3d244ed1974f001223452dfa643accb2a9d87585d32f9e79296a96070e6d8f97ecfe9d35aed7"

RPROVIDES:${PN} += "python3.11dist(m2crypto) \
python311-M2Crypto \
python311-M2Crypto(aarch-64) \
python3dist(m2crypto)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
python(abi) \
python311-typing \
python311-xml"

inherit rpm
