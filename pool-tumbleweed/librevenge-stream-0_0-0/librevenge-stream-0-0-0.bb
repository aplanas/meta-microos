SUMMARY = "A base library for writing document import filters (stream implementations)"
DESCRIPTION = "librevenge is a base library for writing document import filters. It has \
interfaces for text documents, vector graphics, spreadsheets and \
presentations. \
This package contains the different stream implementations."
LICENSE = "BSD-3-Clause & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.0.5"

RPM_NAME = "librevenge-stream-0_0-0-0.0.5-1.3.aarch64.rpm"
RPM_HASH = "2195b61f318b59987730506021a2f33039841d47f677f57bd4578a5c41d3c34a280acd1449c65cf4bd7c10fd68c8ab590e757a88c7093d3aa055d9774f14ac09"

RPROVIDES:${PN} += "librevenge-stream-0.0.so.0()(64bit) \
librevenge-stream-0_0-0 \
librevenge-stream-0_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libz.so.1()(64bit)"

inherit rpm
