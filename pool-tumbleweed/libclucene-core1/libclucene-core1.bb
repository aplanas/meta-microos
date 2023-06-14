SUMMARY = "C++ implementation of the Lucene text search engine"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-core1-2.3.3.4-18.5.aarch64.rpm"
RPM_HASH = "e3cfbf877018b79fb2314a91ea35fec1c419cc28279f1b870ef5848585260588d47dafd5869f8eb5566f0c208d188cea21f5d021cc806a1608a37d54d5ff088c"

RPROVIDES:${PN} += "libclucene-core.so.1 \
libclucene-core1 \
libclucene2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclucene-shared.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
