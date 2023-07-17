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

PV = "0.39.0"

RPM_NAME = "python310-M2Crypto-0.39.0-1.1.aarch64.rpm"
RPM_HASH = "175072d954aefb4d6e905ec193551600fe47bba9b339e24428b18a110ea294d7eb43507689bb5a47d4c3ef7e2d8cbbdc709c37c05d0b2a4934c91e1ed3a5e6a1"

RPROVIDES:${PN} += "python3.10dist-m2crypto \
python310-M2Crypto \
python3dist-m2crypto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python310-typing \
python310-xml"

inherit rpm
