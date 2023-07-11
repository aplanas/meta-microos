SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
Compatibility package."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-libz-1.2.13-3.2.noarch.rpm"
RPM_HASH = "7085f31308a67b5958f004cc5d2364ba58596639071e01c2e5e120c84e0e1ffc5da9e2b8392d76a22fdafe8763a8ac81c7c8d8985d8a3fc34082bf9edfb9faa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libz \
mingw32-libz.dll \
mingw32-zlib"

RDEPENDS:${PN} += ""

inherit rpm
