SUMMARY = "Haskell array library"
DESCRIPTION = "This package provides the Haskell array library."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-0.5.4.0-1.1.aarch64.rpm"
RPM_HASH = "352020c1c13bc9902e3bb3a635a8d27ffedb4cadfb00c7a7dc0bb919d474526208299cd931b283670d835b5c165f6388df9855082505bac6c201a12911be3583"

RPROVIDES:${PN} += "ghc-array \
libHSarray-0.5.4.0-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
