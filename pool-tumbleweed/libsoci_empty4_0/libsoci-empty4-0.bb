SUMMARY = "Empty back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains an empty back-end."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_empty4_0-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "8b3946c27aa63708c30b0efe919e46403d81c67cec9a1458510661ccda66fe96da139e48b22474b7350e63d963042e787ad64a8ed9ecf205d23f4df2b9fdacdd"

RPROVIDES:${PN} += "libsoci4_0-backend \
libsoci_empty.so.4.0()(64bit) \
libsoci_empty4_0 \
libsoci_empty4_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libsoci_core.so.4.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
