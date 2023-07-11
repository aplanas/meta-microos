SUMMARY = "A JPEG-LS library"
DESCRIPTION = "An optimized implementation of the JPEG-LS standard for lossless and \
near-lossless image compression. JPEG-LS is a low-complexity standard that \
matches JPEG 2000 compression ratios. In terms of speed, CharLS outperforms \
open source and commercial JPEG LS implementations."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "libcharls2-2.4.1-1.4.aarch64.rpm"
RPM_HASH = "9921d6cb5fb922994b94b6d15d12b8ef22a5ecbd72bb198e19797f382aab1cd61d9128e89cacba5f53b0eeab59c38fb126adb135c05a347c195db0eaca87644a"

RPROVIDES:${PN} += "libcharls.so.2 \
libcharls2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
