SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-zlib1-1.2.13-2.1.noarch.rpm"
RPM_HASH = "1ac30db693440a737733107f2c4dce5b0df18e164631239d56026fc4b4d69cf11c032db74e54300062e3577b962bb5601e35a5ed3031ae7d555170b115dd7f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-zlib \
mingw64-zlib1"

RDEPENDS:${PN} += ""

inherit rpm
