SUMMARY = "A JPEG-LS library"
DESCRIPTION = "An optimized implementation of the JPEG-LS standard for lossless and \
near-lossless image compression. JPEG-LS is a low-complexity standard that \
matches JPEG 2000 compression ratios. In terms of speed, CharLS outperforms \
open source and commercial JPEG LS implementations."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "libcharls2-2.4.1-1.3.aarch64.rpm"
RPM_HASH = "4e156880f54236d2cab8d090f7c95adca3be996b37f3016602fd60f5ac283d242481f9537ce6debec7ceb7d56e9b876b4faf2548cb216fd09162f983579b790c"

RPROVIDES:${PN} += "libcharls.so.2()(64bit) \
libcharls2 \
libcharls2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
