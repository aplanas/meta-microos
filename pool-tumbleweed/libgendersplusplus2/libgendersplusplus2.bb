SUMMARY = "C++ library API for genders"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with genders. This is the C++ API."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "libgendersplusplus2-1.28.1-2.3.aarch64.rpm"
RPM_HASH = "fb199a4674412b7cf6731451f624411eb21aff06c7eca51cdefea42e7ec2093e0b45443eab6de5f5fe9680be1e5945238b68b5569a4f1ab5f19cb85083e10618"

RPROVIDES:${PN} += "libgendersplusplus.so.2()(64bit) \
libgendersplusplus2 \
libgendersplusplus2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
genders-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgenders.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
