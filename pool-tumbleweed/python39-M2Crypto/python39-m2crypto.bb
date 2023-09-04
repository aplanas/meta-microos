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

RPM_NAME = "python39-M2Crypto-0.39.0-2.1.aarch64.rpm"
RPM_HASH = "8ae891d2321e284401fa4553d76683c572c7cb6b68e1347b636e3d12d53959bc275b8e335b722b1176d008274232515e9b077897e84e4ad3884aa7da214242a2"

RPROVIDES:${PN} += "python3.9dist-m2crypto \
python39-M2Crypto \
python3dist-m2crypto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python39-typing \
python39-xml"

inherit rpm
