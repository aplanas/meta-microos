SUMMARY = "C/C++ library for counting prime numbers"
DESCRIPTION = "This package contains the shared runtime library for primecount."
LICENSE = "BSD-2-Clause"

PV = "7.9"

RPM_NAME = "libprimecount7-7.9-1.1.aarch64.rpm"
RPM_HASH = "7ec032f17280210c394d6c154bae59bc1a49916be8f9a6c6f2a4339e9ca183d4389f30050c8ab689742cf30689b9c53ec711f7d487a9319eb3991ffe3f369a04"

RPROVIDES:${PN} += "libprimecount.so.7 \
libprimecount7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libprimesieve.so.11 \
libstdc++.so.6"

inherit rpm
