SUMMARY = "Development files for lime"
DESCRIPTION = "LIME is an encryption library for one-to-one and group instant \
messaging, allowing users to exchange messages privately and \
asynchronously. It supports multiple devices per user and multiple \
users per device. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use lime."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "lime-devel-5.2.49-1.1.aarch64.rpm"
RPM_HASH = "4ce78a8203aa871ca33f1bef23f4b49a2b15dbbdb0410f25cd45ba0901b529f44a1d4f2e80c02182512e1fedf27b2b83d56182c10c326d31d671d8a98db84a07"

RPROVIDES:${PN} += "lime-devel \
lime-devel(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbctoolbox-tester.so.1()(64bit) \
libbctoolbox.so.1()(64bit) \
libbellesip.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
liblime.so.0()(64bit) \
liblime0 \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libsoci_core.so.4.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
soci-devel \
soci-sqlite3-devel"

inherit rpm
