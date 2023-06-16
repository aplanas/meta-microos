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

PV = "1.3.1"

RPM_NAME = "bzip3-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "318632d540e38bbc2caea60f56e72c2626122b47a8be393d04730f49f3e78218cb4838338d7e12848ac0726e822d54eca50f597beac7aebf9de50beee8ef2efd"

RPROVIDES:${PN} += "bzip3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbzip3.so.0 \
libc.so.6"

inherit rpm
