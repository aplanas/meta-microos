SUMMARY = "C/C++ library for counting prime numbers"
DESCRIPTION = "This package contains the shared runtime library for primecount."
LICENSE = "BSD-2-Clause"

PV = "7.8"

RPM_NAME = "libprimecount7-7.8-1.1.aarch64.rpm"
RPM_HASH = "ae34166a53fe3438ea0942d4d6585694d6a44d39eaefda4c33111a9d22e9b7520523ca92d8a40d119aadbee373937557489161ecab5b5668ba877749505e6518"

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
