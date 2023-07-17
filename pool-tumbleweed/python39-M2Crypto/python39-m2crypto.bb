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

RPM_NAME = "python39-M2Crypto-0.39.0-1.1.aarch64.rpm"
RPM_HASH = "955a90442d17436d02323bc3bf00b481d73d2c3e5fa46d38eebdcdb8277f45e262039789d4784cf1fa2cc78dc535158b2194f036b48552ddfa19beef3a1796d1"

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
