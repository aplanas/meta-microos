SUMMARY = "Zlib compression library (development files)"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage holds the development headers for the library."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-zlib-devel-1.2.13-3.2.noarch.rpm"
RPM_HASH = "55475ef2b3b0fd836b6b1a71a6e769ea45f8a134b9b9977a5bd1d4a26492dbf57e2b88255e380349a376a3ff095028bee79d001e7b33b165474f505f8d247626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-z \
mingw32-pkg-zlib \
mingw32-pkg-zlib-static \
mingw32-zlib-devel"

RDEPENDS:${PN} += "mingw32-libz"

inherit rpm
