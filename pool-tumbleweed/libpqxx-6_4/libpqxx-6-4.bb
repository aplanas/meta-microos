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

RPROVIDES:${PN} += "libpqxx-6-4 \
libpqxx-6.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
