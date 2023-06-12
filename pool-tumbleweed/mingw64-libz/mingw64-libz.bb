SUMMARY = "Zlib compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
Compatibility package."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-libz-1.2.13-2.1.noarch.rpm"
RPM_HASH = "b28f02fcd85f62f433366239bc06fd9e9b141131000b32ba6729d2e162476e0a5d5904908cbca88be5a18a32fde1bd28f275603dfbd482a72726602765f57852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(libz.dll) \
mingw64-libz \
mingw64-zlib"
RDEPENDS:${PN} += ""

inherit rpm
