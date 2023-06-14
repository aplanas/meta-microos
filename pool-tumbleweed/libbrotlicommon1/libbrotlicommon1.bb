SUMMARY = "Common Library for Brotli Compression"
DESCRIPTION = "Common library for the Brotli general purpose lossless data \
compression algorithm."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libbrotlicommon1-1.0.9-3.3.aarch64.rpm"
RPM_HASH = "e936d973a4716f75dcf51a5dfaab064f7666b5671253e906062d4f10028a6df98ce7c2b691e7cca1914e23da12382e5cca286b8b4c0fb77587716b5d7fa56011"

RPROVIDES:${PN} += "libbrotlicommon.so.1 \
libbrotlicommon1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
