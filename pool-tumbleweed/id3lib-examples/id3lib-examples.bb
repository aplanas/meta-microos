SUMMARY = "Example Applications for the id3lib Library"
DESCRIPTION = "This package contains simple example applications that make use of \
id3lib, a software library for ID3v1 and ID3v2 tag manipulation."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.3"

RPM_NAME = "id3lib-examples-3.8.3-268.9.aarch64.rpm"
RPM_HASH = "207411100b44529b0b130d6dc3abb29de006b2971540f44ed865f9b2edc695d60b3108c58b9963272bbbd5da54db412a1e6e45a67bdf1042a3bed31a18d1cdad"

RPROVIDES:${PN} += "id3lib-examples \
id3lib-examples(aarch-64)"

RDEPENDS:${PN} += "id3lib \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libid3-3.8.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
