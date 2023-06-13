SUMMARY = "Shared library from liboauth"
DESCRIPTION = "liboauth is a collection of c functions implementing the http://oauth.net API. \
 \
liboauth provides functions to escape and encode stings according to \
OAuth specifications and offers high-level functionality built on top to sign \
requests or verify signatures using either NSS or OpenSSL for calculating \
the hash/signatures. \
 \
This archive contains the shared library files from liboauth."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "liboauth0-1.0.3-4.6.aarch64.rpm"
RPM_HASH = "4232ecdfaa73a71d4f9b7c56117f2af3a704664d40eb8afb005f18f74cddd991b4b68330b36ffd8b5ca3296a9b6ea57b3bab80263410b6d38a4c470c4f8bc937"

RPROVIDES:${PN} += "liboauth.so.0()(64bit) \
liboauth0 \
liboauth0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit)"

inherit rpm
