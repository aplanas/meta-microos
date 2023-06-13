SUMMARY = "Shared library from snappy"
DESCRIPTION = "Snappy is a compression/decompression library. It does not aim for maximum \
compression, or compatibility with any other compression library; instead, it \
aims for high speeds and reasonable compression. For instance, compared to \
the fastest mode of zlib, Snappy is an order of magnitude faster for most \
inputs, but the resulting compressed files are anywhere from 20% to 100% \
bigger. On a single core of a 1st-generation Core i7 processor in 64-bit \
mode, Snappy compresses at about 250 MB/sec or more and decompresses at about \
500 MB/sec or more. \
 \
This package holds the shared library of snappy."
LICENSE = "BSD-3-Clause"

PV = "1.1.9"

RPM_NAME = "libsnappy1-1.1.9-2.8.aarch64.rpm"
RPM_HASH = "33a6c0e328c321f2f62edf05c8137065ce19e4eccc0b39e786f1f13fa656f5a08f091186c4fafde5146f2e66f4305facd8938032a237acb233cd00115d30578f"

RPROVIDES:${PN} += "libsnappy.so.1()(64bit) \
libsnappy1 \
libsnappy1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
