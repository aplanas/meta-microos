SUMMARY = "Development and Header Files for Brotli Compression"
DESCRIPTION = "Development and headers files for (de)compressing data using the \
Brotli general purpose lossless compression algorithm. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libbrotli-devel-1.0.9-3.4.aarch64.rpm"
RPM_HASH = "7d16c5684cd3274c6301e1f2791c5778a4553cf7ce6092a518ea1ec405075d431040bf00bc3e032b18017c180f82c377ff05ab1f82f06193edb1b3ba992918bd"

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
