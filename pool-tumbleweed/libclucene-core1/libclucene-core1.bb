SUMMARY = "C++ implementation of the Lucene text search engine"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-core1-2.3.3.4-18.6.aarch64.rpm"
RPM_HASH = "f94396a53a07fcbc34263b17b5e136730df86c8a4354f36bcc0b3d569a7f2a19a2076388c7cc318fd933672531c5de360624b8e86d12008a5efab7cfca317c34"

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
