SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
Compatibility package."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-libz-1.2.13-3.1.noarch.rpm"
RPM_HASH = "8126137a4b4d4ded821097cade63a151c49559e51db3710209cffbedc2c44e117feca73e933fca16e5d59720bf45c6ec3ad5d172882ed9d08d604865aa899fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(libz.dll) \
mingw32-libz \
mingw32-zlib"

RDEPENDS:${PN} += ""

inherit rpm
