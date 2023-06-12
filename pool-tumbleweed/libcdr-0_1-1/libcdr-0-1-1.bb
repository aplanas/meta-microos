SUMMARY = "Library for parsing the Corel Draw file format structure"
DESCRIPTION = "libcdr is a library for parsing the Corel Draw file format structure."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-0_1-1-0.1.7-1.18.aarch64.rpm"
RPM_HASH = "091d3586e2bb594acaf824170f8efa88b479cf4e6c693fc40e00b66b66997db40abc9507fa70b172c2e6a5d65f63e2b60b2e6c16740ef70fc6b2bedf5c561d9b"

RPROVIDES:${PN} += "libcdr-0.1.so.1()(64bit) \
libcdr-0_1-1 \
libcdr-0_1-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
