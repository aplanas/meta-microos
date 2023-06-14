SUMMARY = "A high-performance, full-featured text search engine written in C++"
DESCRIPTION = "An up to date C++ port of the popular Java Lucene library, a high-performance, full-featured text search engine."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.0.8"

RPM_NAME = "liblucene++0-3.0.8-4.2.aarch64.rpm"
RPM_HASH = "f03639f1dcd122d14684d11aeae8c1669911760aa017ed07edd3bb520968044fd4bc5bca93e10a88aa866c4cc40530ecdae0726f6886c01a9cc53c0e1537e260"

RPROVIDES:${PN} += "liblucene++-contrib.so.0 \
liblucene++.so.0 \
liblucene++0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
