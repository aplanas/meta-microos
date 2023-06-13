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

RPM_NAME = "python-M2Crypto-doc-0.38.0-6.3.noarch.rpm"
RPM_HASH = "051d3269d4979d23f9adea7684ef762462340d677f37fd7c33adfeb4e22e4978c48d917960875c460466527593e751cf133e36ac3305fc66876119e8ef79ccdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-M2Crypto-doc"

RDEPENDS:${PN} += ""

inherit rpm
