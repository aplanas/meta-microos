SUMMARY = "Library implementing the DEFLATE compression algorithm"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "libz1-1.2.13-4.2.aarch64.rpm"
RPM_HASH = "e351982b5f1169b1942b0f1be363168dcc6692023c676c08cbfcbd6023f75ee941b6571d46e21df1cf3185948e343285bcbd0da1af5cdd9bc1db36de775431c2"

RPROVIDES:${PN} += "libz.so.1 \
libz1 \
zlib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
