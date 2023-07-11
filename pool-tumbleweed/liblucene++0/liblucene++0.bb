SUMMARY = "A high-performance, full-featured text search engine written in C++"
DESCRIPTION = "An up to date C++ port of the popular Java Lucene library, a high-performance, full-featured text search engine."
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.0.8"

RPM_NAME = "liblucene++0-3.0.8-4.3.aarch64.rpm"
RPM_HASH = "38cc3d5ea67d145b936cda8b1c7931c4bb09ddb8e075ac4ff3fecbd3b2e67c5dc8c79722b3c6206bae5970104130913c78192aff27fc977d69493951de8b67f7"

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
