SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-zlib1-1.2.13-3.2.noarch.rpm"
RPM_HASH = "1d5d8a847cac6dc34424378e022ee45b9bce88fa992d6138fc349afd7f66f58d32cb5e1fe96e494e69298dd5d751f655bbdcb6574231fbdc115f02be459ab08e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-zlib \
mingw32-zlib1"

RDEPENDS:${PN} += ""

inherit rpm
