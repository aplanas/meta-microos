SUMMARY = "Documentation for the Crypto and SSL toolkit for Python"
DESCRIPTION = "M2Crypto is a crypto and SSL toolkit for Python featuring the following: \
 \
RSA, DSA, DH, HMACs, message digests, symmetric ciphers (including \
AES). SSL functionality to implement clients and servers. HTTPS \
extensions to Python's httplib, urllib, and xmlrpclib. Unforgeable \
HMAC'ing AuthCookies for web session management. FTP/TLS client and \
server. S/MIME. ZServerSSL: A HTTPS server for Zope. ZSmime: An S/MIME \
messenger for Zope. \
 \
Documentation for the Crypto and SSL toolkit for Python"
LICENSE = "MIT"

PV = "0.39.0"

RPM_NAME = "python-M2Crypto-doc-0.39.0-1.1.noarch.rpm"
RPM_HASH = "2863f6691d1f5ac3a13642bef459e06b85c1ab52143fb9eea4a4f208bdf75ecab9df85797e664c015a48812eb6c7ec600c4705f0f9459bf4e50291ad851a949c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-M2Crypto-doc"

RDEPENDS:${PN} += ""

inherit rpm
