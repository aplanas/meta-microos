SUMMARY = "Library implementing the DEFLATE compression algorithm"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "libz1-1.2.13-4.1.aarch64.rpm"
RPM_HASH = "ca746432b97404aff44910d02d28b80952ff50fcb3eaf6e0245c84d76d21a1114767ecc1af1ca626fe6418d94fdbc1bd1c80dd790acb50282fd832eb2d092642"

RPROVIDES:${PN} += "libz.so.1 \
libz1 \
zlib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
