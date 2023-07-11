SUMMARY = "Parallel LZMA Data Compressor"
DESCRIPTION = "Plzip is a parallel version of the lzip data compressor. The files \
produced by plzip are fully compatible with lzip-1.4 or newer. Plzip \
is intended for faster compression/decompression of big files on \
multiprocessor machines. \
 \
Lzip is a lossless data compressor based on the LZMA algorithm, with \
very safe integrity checking and a user interface similar to the one \
of gzip or bzip2. Lzip decompresses almost as fast as gzip and \
compresses better than bzip2, which makes it well suited for software \
distribution and data archiving."
LICENSE = "GPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "plzip-1.10-1.8.aarch64.rpm"
RPM_HASH = "811a9649f09f09b6383774fb507c7025948165f323232c37084eb090a383d6a51a8f0e676c79864d3a095004613f4c19adfe95d39d5d9812bf5f658dd6f4713f"

RPROVIDES:${PN} += "plzip"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz.so.1 \
libstdc++.so.6"

inherit rpm
