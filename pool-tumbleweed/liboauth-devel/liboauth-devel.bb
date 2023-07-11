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

RPM_NAME = "liboauth-devel-1.0.3-4.7.aarch64.rpm"
RPM_HASH = "3a3ab12d668ca5ed3dddb5c4895bc87afd69060c0b4f8ad6b3d0fd3fc0d978b7b03b0719eb0d393305f5a16c236b19296667d383f4bf010e570342c1ed540a84"

RPROVIDES:${PN} += "liboauth-devel \
pkgconfig-oauth"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
liboauth0"

inherit rpm
