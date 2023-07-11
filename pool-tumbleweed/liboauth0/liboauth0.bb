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

RPM_NAME = "liboauth0-1.0.3-4.7.aarch64.rpm"
RPM_HASH = "5e8d8236fac63c1fa37a2931f3aef101320d86ec96b66df507fcfbd28446c88840b3efbe490085e386a164dd290c11c7ff8f39752af863e842b00b7b34500867"

RPROVIDES:${PN} += "liboauth.so.0 \
liboauth0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4"

inherit rpm
