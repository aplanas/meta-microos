SUMMARY = "Development files for the LZ4 compressor"
DESCRIPTION = "LZ4 is a lossless data compression algorithm that is focused on \
compression and decompression speed. It belongs to the LZ77 \
(Lempel–Ziv) family of byte-oriented compression schemes. It is a \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblz4."
LICENSE = "BSD-2-Clause"

PV = "1.9.4"

RPM_NAME = "liblz4-devel-1.9.4-2.4.aarch64.rpm"
RPM_HASH = "4e43fece155ed02ae467d5c46f080b34cdf10c4d1144e2ef5991bd5d1bebfb2196e5bfc2a6e34e0887673599471cd0fbe25ede73e7569962f12ee24b9512ab24"

RPROVIDES:${PN} += "liblz4-devel \
pkgconfig-liblz4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblz4-1"

inherit rpm
