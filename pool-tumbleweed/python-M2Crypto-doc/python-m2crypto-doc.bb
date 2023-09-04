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

RPM_NAME = "python-M2Crypto-doc-0.39.0-2.1.noarch.rpm"
RPM_HASH = "51663a36576c071c2858db61a958233fa563f339b8d7e733b4b6f1b60497008c347fca4d6a050944ab23773887f7a5f215afa8f85378a4dd0a70c8b6e8d0f026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-M2Crypto-doc"

RDEPENDS:${PN} += ""

inherit rpm
