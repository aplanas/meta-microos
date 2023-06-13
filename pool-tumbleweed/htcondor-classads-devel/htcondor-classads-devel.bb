SUMMARY = "Headers for HTCondor's classified advertisement language"
DESCRIPTION = "Header files for HTCondor's ClassAd Library, a powerful and flexible, \
semi-structured representation of data."
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-classads-devel-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "f298ac3b80e12b605a704c0f67108af5d8fc668e5ed4c2a4b7597199510e823b5e08571fb6f27dc5f4fce8bc368fa22908a0e6f99121b9fd82225f70206ed56c"

RPROVIDES:${PN} += "classads-devel \
config(htcondor-classads-devel) \
htcondor-classads-devel \
htcondor-classads-devel(aarch-64)"

RDEPENDS:${PN} += "htcondor-classads \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclassad.so.15()(64bit) \
libcondor_utils_9_0_16.so()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
pcre-devel"

inherit rpm
