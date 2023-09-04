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

RPM_NAME = "python311-M2Crypto-0.39.0-2.1.aarch64.rpm"
RPM_HASH = "4f77dedbccedcfb68fc53e7643b6cda48661a93c62943bd2516a6bb3e47ebdd4fe8c1aab4696b87deb4101f24d2f1670a7f7b6a5375a6fd31edf9c0c6aad40f8"

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
