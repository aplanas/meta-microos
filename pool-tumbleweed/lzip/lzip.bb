SUMMARY = "Lossless Data Compressor based on the LZMA Algorithm"
DESCRIPTION = "Lzip is a lossless data compressor based on the LZMA algorithm, with very safe \
integrity checking and a user interface almost identical to the one of \
bzip2. Lzip is only a data compressor, not an archiver. It has no facilities \
for multiple files, encryption, or archive-splitting, but, in the Unix \
tradition, relies instead on separate external utilities such as GNU Tar for \
these tasks."
LICENSE = "GPL-2.0-or-later"

PV = "1.23"

RPM_NAME = "lzip-1.23-1.7.aarch64.rpm"
RPM_HASH = "f04fcc585c18465a4c31fb2cfb0de6928c9a63dadf78aa0280fc4d7d85c8375d24a9895f1885e06f6560838c377b0a39727f92d5d624d081f2d1d8049138e30c"

RPROVIDES:${PN} += "lzip \
lzip(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
