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
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "bzip3-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "02a559200941d673d91cf16c0042cd262166ee510d077f60af8ce49b7289a41bab9f8835e637ae3d37388036c5b6818915a4a7c1df6e8faf78e3911af54b03fe"

RPROVIDES:${PN} += "bzip3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbzip3.so.0 \
libc.so.6"

inherit rpm
