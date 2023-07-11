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

RPM_NAME = "libsnappy1-1.1.9-2.9.aarch64.rpm"
RPM_HASH = "0c51e9f9c934f01ec57882612699c687e220d02b1d63bd25e157a88448284414fe53834c359d60adb17637f9f9737c1ae0e5b1e0e83da5035c9928e40fef062d"

RPROVIDES:${PN} += "libsnappy.so.1 \
libsnappy1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
