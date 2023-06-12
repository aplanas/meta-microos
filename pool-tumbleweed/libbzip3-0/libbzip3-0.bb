SUMMARY = "Compressor with Burrows–Wheeler transform and PPM context modeling"
DESCRIPTION = "A compressor featuring improved compression ratios and performance \
over bzip2 thanks to a order-0 context mixing entropy coder, a \
Burrows-Wheeler transform code making use of suffix arrays, a RLE \
with Lempel Ziv+Prediction pass based on LZ77-style string matching \
and PPM-style context modeling."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "libbzip3-0-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "74e2729dc0432db4d1be35814417c1b189492339a735e68cf69ae548d88e7a5079f957362b7460ed4263117d52c2fc4c732ccb59fbe986be9ba8386636918eea"

RPROVIDES:${PN} += "libbzip3-0 \
libbzip3-0(aarch-64) \
libbzip3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
