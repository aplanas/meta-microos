SUMMARY = "A journaling, incremental, deduplicating archiver"
DESCRIPTION = "zpaq is a journaling, incremental, deduplicating archiver. \
'Journaling' means that when you update a file or directory, both the \
old and new versions are saved and can be extracted. 'Incremental' \
means that only those files whose last-modified date has changed \
since the previous backup are added. For 100 GB of files, this \
typically takes 1-2 minutes, vs. a few hours to create the first \
version. 'Deduplicating' means that identical files or fragments are \
stored only once to save time and space."
LICENSE = "SUSE-Public-Domain & MIT"

PV = "7.15"

RPM_NAME = "zpaq-7.15-3.9.aarch64.rpm"
RPM_HASH = "cf49b1954225f55a107e701a685e1d7fd29aef2192b3f999b4e5167228b48b2aae4c52ec84df4d4759727bd2d2db6756eb41482843b0711ba1fdc4e6347bb287"

RPROVIDES:${PN} += "zpaq \
zpaq(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
