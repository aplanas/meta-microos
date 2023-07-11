SUMMARY = "Language specific text analyzers for clucene-core"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++. \
 \
This package contains language specific text analyzers for clucene."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-contribs-lib1-2.3.3.4-18.6.aarch64.rpm"
RPM_HASH = "a797454975cc4a7226a5e1c54ef07634865cc0a736337405d4587dcd114d1d79238521f26054a6dd87cd2e6807813a5ea248cc185576988a4fafeaba38196801"

RPROVIDES:${PN} += "libclucene-contribs-lib.so.1 \
libclucene-contribs-lib1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclucene-core.so.1 \
libclucene-shared.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
