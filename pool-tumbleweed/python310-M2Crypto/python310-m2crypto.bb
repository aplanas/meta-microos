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

RPM_NAME = "python310-M2Crypto-0.39.0-2.1.aarch64.rpm"
RPM_HASH = "1e3f41a952805f65fd30bf41dba11951f9ffd17084ac6809598ba42e6b5065c076dfd54c8bfc913333084ea66515ea08b8ede32fe948b5b9dc3ef514a5448cbe"

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
