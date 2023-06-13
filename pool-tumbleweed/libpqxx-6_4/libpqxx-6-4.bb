SUMMARY = "C++ Client Library for PostgreSQL"
DESCRIPTION = "This is the official C++ client API for postgres.  What libpqxx brings you is \
effective use of templates to reduce the inconvenience of dealing with type \
conversions; of standard C++ strings to keep you from having to worry about \
buffer allocation and overflow attacks; of exceptions to take the tedious and \
error-prone plumbing around error handling out of your hands; of constructors \
and destructors to bring resource management under control; and even basic \
object-orientation to give you some extra reliability features that would be \
hard to get with most other database interfaces."
LICENSE = "BSD-3-Clause"

PV = "6.4.5"

RPM_NAME = "libpqxx-6_4-6.4.5-1.19.aarch64.rpm"
RPM_HASH = "311a0757cd41fad5e7bdbafda93f70dc4aacc2753cf1b0f39e1c394b85402105b6799e475da5909da6e6c9f040784ab32b68154f51278b7576bb55922c4742f6"

RPROVIDES:${PN} += "libpqxx-6.4.so()(64bit) \
libpqxx-6_4 \
libpqxx-6_4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
