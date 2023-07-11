SUMMARY = "Distributed Machine Learning Common Codebase"
DESCRIPTION = "DMLC-Core is the backbone library to support all DMLC projects, offers the bricks to build efficient and scalable distributed machine learning libraries."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "libdmlc-0.5-1.9.aarch64.rpm"
RPM_HASH = "3f8faa42cb48b0dfb77e658413bf0759808765c16a486775fbc76d5589d8f6e2118f1c9e218e0e0a4f13c29aaeda4921410f00880c470d698057b1f946bfd294"

RPROVIDES:${PN} += "libdmlc \
libdmlc.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6"

inherit rpm
