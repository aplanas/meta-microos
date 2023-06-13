SUMMARY = "The UCL compression library"
DESCRIPTION = "This package contains a lossless data compression library written in \
ANSI C. UCL implements the NRV compression algorithms. Compared to \
LZO, decompression time is traded for compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "libucl1-1.03-5.3.aarch64.rpm"
RPM_HASH = "6ba7037c026220b82909fe6f2dec6b5068736a1de55097f6fed9cca93a2d94c4646fdb772c9bdd68087ddd6b0868f00b8ab14485d68d8a0100d15a302a0d5e8c"

RPROVIDES:${PN} += "libucl.so.1()(64bit) \
libucl1 \
libucl1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
