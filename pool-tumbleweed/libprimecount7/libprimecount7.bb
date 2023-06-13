SUMMARY = "C/C++ library for counting prime numbers"
DESCRIPTION = "This package contains the shared runtime library for primecount."
LICENSE = "BSD-2-Clause"

PV = "7.8"

RPM_NAME = "libprimecount7-7.8-1.1.aarch64.rpm"
RPM_HASH = "ae34166a53fe3438ea0942d4d6585694d6a44d39eaefda4c33111a9d22e9b7520523ca92d8a40d119aadbee373937557489161ecab5b5668ba877749505e6518"

RPROVIDES:${PN} += "libprimecount.so.7()(64bit) \
libprimecount7 \
libprimecount7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libprimesieve.so.11()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
