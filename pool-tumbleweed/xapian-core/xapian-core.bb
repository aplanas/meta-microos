SUMMARY = "The Xapian Probabilistic Information Retrieval Library"
DESCRIPTION = "Xapian is a Probabilistic Information Retrieval library. It offers an \
adaptable toolkit for adding indexing and search facilities to \
applications."
LICENSE = "GPL-2.0-only"

PV = "1.4.21"

RPM_NAME = "xapian-core-1.4.21-1.3.aarch64.rpm"
RPM_HASH = "b5d29e414a415f8d8446900569ff6c29afec5305d3b25de3b90a23559e955a4fd06bf67e10c608960cfab982e77418180cf068e4f26264281e8037862a347069"

RPROVIDES:${PN} += "xapian-core \
xapian-core(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxapian.so.30()(64bit) \
libxapian30"

inherit rpm
