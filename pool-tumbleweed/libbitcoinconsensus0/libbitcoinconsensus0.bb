SUMMARY = "Bitcoin consensus library"
DESCRIPTION = "The purpose of this library is to make the verification functionality that \
is critical to Bitcoin’s consensus available to other applications, \
e.g. to language bindings such as python-bitcoinlib or alternative node \
implementations."
LICENSE = "MIT"

PV = "25.0"

RPM_NAME = "libbitcoinconsensus0-25.0-1.1.aarch64.rpm"
RPM_HASH = "0865f17809e21625207fd9bbf221a3c8502c95048ac40be5a98bb2168e7a6fcfadc316e812c84ec81ac9f663a674b6d1e15066c1f173d8093d9e2a2865a30a2c"

RPROVIDES:${PN} += "libbitcoinconsensus.so.0()(64bit) \
libbitcoinconsensus0 \
libbitcoinconsensus0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
