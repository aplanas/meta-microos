SUMMARY = "Decompression routines for ancient formats"
DESCRIPTION = "This is a collection of decompression routines for old formats popular \
in the Amiga, Atari computers and some other systems from 80's and 90's \
as well as some that are currently used which were used in a some \
specific way in these old systems. \
 \
For simple usage both a simple command line application as well as a \
simple API to use the decompressors are provided. The compression \
algorithm is automatically detected in most cases, however there are some \
corner cases where it is not entirely reliable due to weaknesses in the \
old format used."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "ancient-2.0.0-1.3.aarch64.rpm"
RPM_HASH = "106fa5d5d84de9b4ac2b9798c5edb1e803ca1164b7906b54d283d871c4a76929d7053f18c9ef00b9fe58a8963c475b843e6f12aee8b301d0005dabd22cb8a4ce"

RPROVIDES:${PN} += "ancient ancient(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libancient.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
