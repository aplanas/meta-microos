SUMMARY = "Very High Ratio and Speed Compression Designed for Large Files"
DESCRIPTION = "LRZIP is a compression program that can achieve very high compression \
ratios and speed when used with large files. It uses the combined compression \
algorithms of lzma for maximum compression, lzo for maximum speed, and the long \
range redundancy reduction of rzip. It is designed to scale with increases \
with RAM size, improving compression further. A choice of either size or \
speed optimizations allows for either better compression than even lzma can \
provide, or better speed than gzip, but with bzip2 sized compression levels."
LICENSE = "GPL-2.0-only"

PV = "0.651"

RPM_NAME = "lrzip-0.651-2.2.aarch64.rpm"
RPM_HASH = "0f616a56ff57ef2296653cb6db860c505957964c3a8f365571d829d3b2692f75ba63ad136965363c913646913d3fa88165475cb2ad5a374bd0490547d2b21cb8"

RPROVIDES:${PN} += "lrzip"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
liblzo2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
