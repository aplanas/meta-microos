SUMMARY = "Utilities for v4l2 / DVB driver development and debugging"
DESCRIPTION = "Utilities for v4l2 / DVB driver authors for development and debugging."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.24.1"

RPM_NAME = "v4l-utils-devel-tools-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "2b4fbb46dfb3168da52c0d8924585f83d1e6258d718d789bf49f435a98bfe879390bfe495d91241547734ca8dc1d4e38b300652f466297cba2e78696aee8bf2a"

RPROVIDES:${PN} += "v4l-utils-devel-tools \
v4l-utils-devel-tools(aarch-64)"
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
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libv4l \
libv4l2.so.0()(64bit)"

inherit rpm
