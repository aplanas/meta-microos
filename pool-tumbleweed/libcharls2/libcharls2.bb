SUMMARY = "A JPEG-LS library"
DESCRIPTION = "An optimized implementation of the JPEG-LS standard for lossless and \
near-lossless image compression. JPEG-LS is a low-complexity standard that \
matches JPEG 2000 compression ratios. In terms of speed, CharLS outperforms \
open source and commercial JPEG LS implementations."
LICENSE = "BSD-3-Clause"

PV = "2.4.2"

RPM_NAME = "libcharls2-2.4.2-1.1.aarch64.rpm"
RPM_HASH = "c232d036460d0ccb7aead02e7b04d25c5f933f65f44e2ae61dfcb7bf49277c917932035e364b5eca56b1d80a9e71fddb439eb7743406d22ab4d64316c0a75fa8"

RPROVIDES:${PN} += "libcharls.so.2 \
libcharls2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
