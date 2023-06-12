SUMMARY = "Utility for Optimizing JPEG Files"
DESCRIPTION = "jpegoptim is a utility for optimizing JPEG files. It provides lossless \
optimization (based on optimizing the Huffman tables) and 'lossy' optimization \
based on setting a maximum quality factor."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "jpegoptim-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "8966d743a1a026087e432173cfac8193576638ec7f2537b2673207fd7b8929e5129e1acf13c442711dc91b7cba1157e5f3fecaa4efc2a8062e0f67af04ce8bfa"

RPROVIDES:${PN} += "jpegoptim \
jpegoptim(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit)"

inherit rpm
