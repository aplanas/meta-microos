SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
Compatibility package."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-libz-1.2.13-2.2.noarch.rpm"
RPM_HASH = "d722557a084580c282fa8f323c4abf8b12e920a3f0db17970ea259fc31dca24b7760a81c1eed30c5173528a375f3b622831a921ba0b1468d17b006872cae3e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libz \
mingw64-libz.dll \
mingw64-zlib"

RDEPENDS:${PN} += ""

inherit rpm
