SUMMARY = "C/C++ library for generating prime numbers"
DESCRIPTION = "This package contains the shared runtime library for primesieve."
LICENSE = "BSD-2-Clause"

PV = "11.1"

RPM_NAME = "libprimesieve11-11.1-1.1.aarch64.rpm"
RPM_HASH = "784645a7da13927011c92546ee46bcf71e4e38a899113ebf81220231ee794931fec8fdbbb4922515a86f23670af12e5a5c1c4a3aff6421541b8cac1b690cd2b3"

RPROVIDES:${PN} += "libprimesieve.so.11 \
libprimesieve11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
