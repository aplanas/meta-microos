SUMMARY = "Deflate/zlib compatible compression library"
DESCRIPTION = "Zopfli Compression Algorithm is a compression library programmed in C to \
perform very good, but slow, deflate or zlib compression."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "libzopfli1-1.0.3-2.1.aarch64.rpm"
RPM_HASH = "9bd6e82ecfd81edf23f39e08fec9e1d4b2683de31d3f9966caafdaa506f451160a84b0db3cf712dc25791d73394839dbf7f237da856e71b0a0a5899d80a7cd21"

RPROVIDES:${PN} += "libzopfli.so.1 \
libzopfli1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
