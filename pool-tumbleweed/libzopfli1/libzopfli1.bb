SUMMARY = "Deflate/zlib compatible compression library"
DESCRIPTION = "Zopfli Compression Algorithm is a compression library programmed in C to \
perform very good, but slow, deflate or zlib compression."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "libzopfli1-1.0.3-2.2.aarch64.rpm"
RPM_HASH = "446fbcd1e3ea2e2343f7f6e28a69fdf91ca407a3a0279773f3b7c1f28ecc92dcc394c7947e03e64ce09c776e6453aa80467e16e9986ee4685bfb90c3341d1b9a"

RPROVIDES:${PN} += "libzopfli.so.1 \
libzopfli1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
