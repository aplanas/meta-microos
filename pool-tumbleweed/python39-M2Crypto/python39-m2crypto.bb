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

RPM_NAME = "python39-M2Crypto-0.38.0-6.6.aarch64.rpm"
RPM_HASH = "929d741e0deb0a6348982a537244e33e95bfa31f4e02b9b0e1b974a649577ba89ee60b2da7ccd3b5115eb5c8cb2ef732b4623eb1a81e3f9709d920389d63597d"

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
