SUMMARY = "Xapian search engine libraries"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. It offers an \
adaptable toolkit for adding indexing and search facilities to \
applications."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "libxapian30-1.4.21-1.3.aarch64.rpm"
RPM_HASH = "c6d5f379e827c6a80e42a36e8f494f155afb204086d72b7022b8dee1fc4627e22695f997492e9af4f002e059e3168b96a9bc509f633005e795ab60935898cfce"

RPROVIDES:${PN} += "libxapian.so.30()(64bit) \
libxapian30 \
libxapian30(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm