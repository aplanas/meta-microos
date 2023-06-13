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
libbctoolbox-tester.so.1()(64bit) \
libbctoolbox.so.1()(64bit) \
libbellesip.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblime.so.0()(64bit) \
liblime0 \
libm.so.6()(64bit) \
libsoci_core.so.4.0()(64bit) \
libstdc++.so.6()(64bit) \
soci-devel \
soci-sqlite3-devel"

inherit rpm
