SUMMARY = "Language specific text analyzers for clucene-core"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++. \
 \
This package contains language specific text analyzers for clucene."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-contribs-lib1-2.3.3.4-18.5.aarch64.rpm"
RPM_HASH = "b9f934ea92751eb1c2d8414b144292f9c0c9ac230947c2f35b86643fd9af109933b46ad80a42d7a997b9a245bd2e6e5e614ac8bd5d5fff1a270af7c1246a9c79"

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
