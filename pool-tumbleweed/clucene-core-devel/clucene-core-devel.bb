SUMMARY = "Development files for clucene library"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++. \
 \
This package holds the development files for clucene."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "clucene-core-devel-2.3.3.4-18.5.aarch64.rpm"
RPM_HASH = "99496e06fd0d2bcff4dd8ac988720c05f7762ded6e35282e94676d74742c69070733638c8963fb2455f3c6091d67db360521782c4ec767411814849dbc0222e9"

RPROVIDES:${PN} += "clucene-core-devel \
clucene-core-devel(aarch-64) \
pkgconfig(libclucene-core)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclucene-contribs-lib1 \
libclucene-core1 \
libclucene-shared1 \
libstdc++-devel"

inherit rpm
