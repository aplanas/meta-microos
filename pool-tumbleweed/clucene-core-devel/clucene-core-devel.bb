SUMMARY = "Development files for clucene library"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++. \
 \
This package holds the development files for clucene."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "clucene-core-devel-2.3.3.4-18.6.aarch64.rpm"
RPM_HASH = "1f5dab533ecbc4857df88a3af7fffac31ede699a69c54d10d662f004e8886b7d32f3910c91d67e199c61976fe95e483598ccfc3cca3463f5f2056e555a6b6248"

RPROVIDES:${PN} += "clucene-core-devel \
pkgconfig-libclucene-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclucene-contribs-lib1 \
libclucene-core1 \
libclucene-shared1 \
libstdc++-devel"

inherit rpm
