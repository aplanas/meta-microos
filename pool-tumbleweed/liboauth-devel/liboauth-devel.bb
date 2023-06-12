SUMMARY = "Development and Include Files for liboauth"
DESCRIPTION = "liboauth is a collection of c functions implementing the http://oauth.net API. \
 \
liboauth provides functions to escape and encode stings according to \
OAuth specifications and offers high-level functionality built on top to sign \
requests or verify signatures using either NSS or OpenSSL for calculating \
the hash/signatures. \
 \
This archive contains the header files for liboauth development."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "liboauth-devel-1.0.3-4.6.aarch64.rpm"
RPM_HASH = "790502fd943392a9f8bd81239d7e877e5f143cd94c55a2203986bc3e0039db9cfb8b5157f7b42c0eb7ffeb652968bd5e97cae284b32d72fc793b00a8ff260a71"

RPROVIDES:${PN} += "liboauth-devel \
liboauth-devel(aarch-64) \
pkgconfig(oauth)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liboauth0"

inherit rpm
