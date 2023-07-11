SUMMARY = "Collection of C++ functions emulating Python's string class methods"
DESCRIPTION = "Pystring is a collection of C++ functions which match the interface and \
behavior of Python's string class methods using std::string. Implemented in \
C++, it does not require or make use of a Python interpreter. It provides \
convenience and familiarity for common string operations not included in the \
standard C++ library. It's also useful in environments where both C++ and \
Python are used. \
 \
Overlapping functionality (such as index and slice/substr) of std::string is \
included to match Python interfaces. \
 \
Originally developed at Sony Pictures Imageworks. \
http://opensource.imageworks.com/"
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "libpystring0_0-1.1.3-1.9.aarch64.rpm"
RPM_HASH = "3db74b830a7eb3cfc0531140118e49366e04762e7871da424b02e8b80a2ba48191c6abf686a2e66c65af2912f0ba6eabd00d276951c180d73f592bd6947dd0c6"

RPROVIDES:${PN} += "libpystring.so.0.0 \
libpystring0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
