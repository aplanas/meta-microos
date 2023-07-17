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

RPM_NAME = "python311-M2Crypto-0.39.0-1.1.aarch64.rpm"
RPM_HASH = "423a513fdd0baa9b1c1fe6c425f9264fe8e633feb2da7a3f45c38842797369d28fe83ca7c4517d7f326f3ca2065ff113fa7ad43c30f4d476407e111091258b7f"

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
