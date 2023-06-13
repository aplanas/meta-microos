SUMMARY = "Tools to work with NUMBERTEXT and MONEYTEXT functions"
DESCRIPTION = "This package contains tools to work with NUMBERTEXT and MONEYTEXT functions"
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-tools-1.0.11-1.3.aarch64.rpm"
RPM_HASH = "72d5f04ce9469e4df9142def7864aa7dfc632f522beb56d2e74f77cdf9aed34756b32775440aebae96ca6dbc8bec5437b3adaf07d144f5b718cc79a9a7e721c3"

RPROVIDES:${PN} += "libnumbertext-tools \
libnumbertext-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libnumbertext-1.0.so.0()(64bit) \
libnumbertext-data \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
