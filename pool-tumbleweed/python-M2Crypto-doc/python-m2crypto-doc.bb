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

PV = "0.38.0"

RPM_NAME = "python-M2Crypto-doc-0.38.0-6.6.noarch.rpm"
RPM_HASH = "319f1d63ca9ad2b2fe9667580e3f9172cc485fb075b960407558fab6c3fc8d51891586c30ec9193d4e863155b4a7b2f4b0f730ace4514e6b74b6a466fc41fd6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-M2Crypto-doc"

RDEPENDS:${PN} += ""

inherit rpm
