SUMMARY = "Development and Header Files for Brotli Compression"
DESCRIPTION = "Development and headers files for (de)compressing data using the \
Brotli general purpose lossless compression algorithm. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libbrotli-devel-1.0.9-3.3.aarch64.rpm"
RPM_HASH = "3c49df9b9e56a695fe939988fca6dcbc39fb2e78c9f7c8e805a31a14a561e17db557277ea4231d0b602abe175cbcdd08b0e9999863bc4594e4846dd8277bd99f"

RPROVIDES:${PN} += "libbrotli-devel \
libbrotlicommon-devel \
libbrotlidec-devel \
libbrotlienc-devel \
pkgconfig-libbrotlicommon \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbrotlicommon1 \
libbrotlidec1 \
libbrotlienc1 \
pkgconfig-libbrotlicommon"

inherit rpm
