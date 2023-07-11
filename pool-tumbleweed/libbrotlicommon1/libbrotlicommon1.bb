SUMMARY = "Common Library for Brotli Compression"
DESCRIPTION = "Common library for the Brotli general purpose lossless data \
compression algorithm."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libbrotlicommon1-1.0.9-3.4.aarch64.rpm"
RPM_HASH = "20ad366978b8ced7c405a5bd2f28f2aeb118d725bc71a35b41a8e97d216d5349f3a3f2cd54bce18a1312ba442d6ad25b85fa306498ed863be99aa4937658ec13"

RPROVIDES:${PN} += "libbrotlicommon.so.1 \
libbrotlicommon1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
