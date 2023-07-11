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

RPM_NAME = "python310-M2Crypto-0.38.0-6.6.aarch64.rpm"
RPM_HASH = "5d971a9ab906f4135582b07750645580dfa1e6f669064897502220ea85708b5a1ec9fa69f0806e8e4058ca1e4c4cb40051907aebbdb35523a66652e6263ce64c"

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
