SUMMARY = "Zlib compression library (development files)"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage holds the development headers for the library."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-zlib-devel-1.2.13-2.2.noarch.rpm"
RPM_HASH = "eca75d6329190b32da109f241a837ae6e1e3a3685bd320ba8b5a366af6c11bdcb290d2d96cbec6a4c3292978c938e0ba5298318c689cac0e62043881fb322650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-z \
mingw64-pkg-zlib \
mingw64-pkg-zlib-static \
mingw64-zlib-devel"

RDEPENDS:${PN} += "mingw64-libz"

inherit rpm
