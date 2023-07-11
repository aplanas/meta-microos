SUMMARY = "C/C++ library for generating prime numbers"
DESCRIPTION = "This package contains the shared runtime library for primesieve."
LICENSE = "BSD-2-Clause"

PV = "11.1"

RPM_NAME = "libprimesieve11-11.1-1.2.aarch64.rpm"
RPM_HASH = "b54a004add42c1bcc9f63e9b10a551b5ad061c91925f9e5b23f448c1bcd148015474ec90f0474d2bf663716ac6a5112772d689c93d396dd86b186c54f60b8cb5"

RPROVIDES:${PN} += "libprimesieve.so.11 \
libprimesieve11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
