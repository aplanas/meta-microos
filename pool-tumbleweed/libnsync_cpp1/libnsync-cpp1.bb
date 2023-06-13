SUMMARY = "Library that exports various synchronization primitives"
DESCRIPTION = "Library for C++ that exports various synchronization primitives"
LICENSE = "Apache-2.0"

PV = "1.23.0"

RPM_NAME = "libnsync_cpp1-1.23.0-2.12.aarch64.rpm"
RPM_HASH = "b36e956b6364000bd77590e9e2372eebbd49c3e0b81fb14be7eae48f3436c8362765faf72e06d53df7313a9460522acfa4394431058ee647229b2e3bbcba1b6c"

RPROVIDES:${PN} += "libnsync_cpp.so.1()(64bit) \
libnsync_cpp1 \
libnsync_cpp1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
