SUMMARY = "Read image/video from socket file"
DESCRIPTION = "Read image/video from socket file"
LICENSE = "GPL-3.0+"

PV = "0.0.0+git20220726.2d7d79c"

RPM_NAME = "libdareader1-0.0.0+git20220726.2d7d79c-2.2.aarch64.rpm"
RPM_HASH = "5223b2d75b36d17173b5e4e2031fac57a2e539dbd1d5664695785446a3c6136d39066fe7def23e2c6d7b49e6f1fe2ea94e701223bb25a77dc2174f6fb5276ee4"

RPROVIDES:${PN} += "libdareader.so.1()(64bit) \
libdareader1 \
libdareader1(aarch-64)"
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
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
