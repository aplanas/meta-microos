SUMMARY = "HFST spell checker runtime libraries"
DESCRIPTION = "HFST spell checker Runtime libraries for hfst-ospell"
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "libhfstospell11-0.5.1-4.4.aarch64.rpm"
RPM_HASH = "37bacd3c5ee01474984813672f93853f5fe4376d4b8a1c24f023ee1288144bf6b0ed887e31c41293bceda33f9f1bfbf0de425c54c8add3bc5b883596dd974d76"

RPROVIDES:${PN} += "libhfstospell \
libhfstospell.so.11()(64bit) \
libhfstospell11 \
libhfstospell11(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.31)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
