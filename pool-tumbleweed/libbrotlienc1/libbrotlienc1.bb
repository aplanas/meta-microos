SUMMARY = "Library for Brotli Compression"
DESCRIPTION = "Compression library for the Brotli general purpose lossless data \
compression algorithm. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libbrotlienc1-1.0.9-3.4.aarch64.rpm"
RPM_HASH = "b23358ee6e198918438e03d559a75288038d2997dc2790251d38d89f48364e8311bcab6c78f92e2e2fa64312774435c02b44c141117dad159fd3926b2cbdfc78"

RPROVIDES:${PN} += "libbrotlienc.so.1 \
libbrotlienc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbrotlicommon.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
