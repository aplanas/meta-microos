SUMMARY = "Compressor with Burrows–Wheeler transform and PPM context modeling"
DESCRIPTION = "A compressor featuring improved compression ratios and performance \
over bzip2 thanks to a order-0 context mixing entropy coder, a \
Burrows-Wheeler transform code making use of suffix arrays, a RLE \
with Lempel Ziv+Prediction pass based on LZ77-style string matching \
and PPM-style context modeling. \
 \
bzip3 1.3.0 can outperform zstd 1.5.5 on specific data sets, e.g. \
15% better ratio for same compress time on source code, but has \
time trouble with e.g. object files."
LICENSE = "LGPL-3.0-or-later & BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "bzip3-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "51eb6d4cba2c1e240882493a0b087e78a0a6a5ad88def7fd6cd5230dd49736a6b5fee6332a52b23b44953d1e060d396ea72656278c81a20dd949168f048bcf4c"

RPROVIDES:${PN} += "bzip3 bzip3(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbzip3.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
