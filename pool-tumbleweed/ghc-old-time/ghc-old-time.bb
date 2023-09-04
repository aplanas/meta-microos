SUMMARY = "Time library"
DESCRIPTION = "This package provides the old time library. \
 \
For new projects, the newer <http://hackage.haskell.org/package/time time \
library> is recommended."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-1.1.0.3-13.4.aarch64.rpm"
RPM_HASH = "ac8d5e2121afc9ec30e4deed371d4cfdab14cab42a8e78ed6af5903067a6cbb24edca615f94c80f0e5a1ecc374d57b65fd8acacc8d2d315a2f3881760af4b3a0"

RPROVIDES:${PN} += "ghc-old-time \
libHSold-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
