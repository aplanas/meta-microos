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

RPM_NAME = "python310-M2Crypto-0.38.0-6.3.aarch64.rpm"
RPM_HASH = "3f3c64d50b675d0c680ebfa44af5fb10a36ab08d5d10b643b3b34ef06e9ea5ca210d7d110d73c36a25201ed06255b8e358992d11500e039376e4b96963197cf0"

RPROVIDES:${PN} += "python3-M2Crypto \
python3.10dist-m2crypto \
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
