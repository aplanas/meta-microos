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

RPM_NAME = "python311-M2Crypto-0.38.0-6.6.aarch64.rpm"
RPM_HASH = "b65939cad5ed43b7b91044499ba2d6c87772e0fdaee0248332f9fdfbbfbd7c225d8ecc5079edf86c364fedbcaab6485e181bc116bccfcca2ee820b6ab76a6a2f"

RPROVIDES:${PN} += "python3-M2Crypto \
python3.11dist-m2crypto \
python311-M2Crypto \
python3dist-m2crypto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python311-typing \
python311-xml"

inherit rpm
