SUMMARY = "Library for Brotli Decompression"
DESCRIPTION = "Decompression library for the Brotli general purpose lossless data \
compression algorithm. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libbrotlidec1-1.0.9-3.3.aarch64.rpm"
RPM_HASH = "1f6b1db40c1a9fd81da413267872dcbf424d7f6d1225dfb7889c7b1e5523792585af56214bf6c7a406c952468124a5926fe943726d5afa21e3a796523e7eed76"

RPROVIDES:${PN} += "libbrotlidec.so.1()(64bit) \
libbrotlidec1 \
libbrotlidec1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbrotlicommon.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
