SUMMARY = "Library for Brotli Decompression"
DESCRIPTION = "Decompression library for the Brotli general purpose lossless data \
compression algorithm. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libbrotlidec1-1.0.9-3.4.aarch64.rpm"
RPM_HASH = "1b2631a4f19a3c933cc3bf07e9c64aee50a632997f7ffc0eaab8e525ce817b8082c8666dfaf73697625b789a15d8393b39141b24b054f17af35b86d30f986065"

RPROVIDES:${PN} += "libbrotlidec.so.1 \
libbrotlidec1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbrotlicommon.so.1 \
libc.so.6"

inherit rpm
