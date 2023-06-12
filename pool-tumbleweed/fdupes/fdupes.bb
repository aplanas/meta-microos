SUMMARY = "Tool to identify or delete duplicate files"
DESCRIPTION = "FDUPES is a program for identifying or deleting duplicate files \
residing within specified directories."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "fdupes-2.2.1-1.3.aarch64.rpm"
RPM_HASH = "c496cbd738748afea86a658eb62b43590fdab57203ee5a97f2bddc0a00631827c65fe9d390fa4fa2b6a51321d5d02aca6c43bc47fd70d34cf2bfcccb82a8b98d"

RPROVIDES:${PN} += "fdupes \
fdupes(aarch-64) \
rpm_macro(fdupes)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm