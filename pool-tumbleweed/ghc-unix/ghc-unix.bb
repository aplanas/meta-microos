SUMMARY = "Haskell unix library"
DESCRIPTION = "This package provides the Haskell unix library."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-2.7.3-1.1.aarch64.rpm"
RPM_HASH = "b223caec170e17aec3788ca1d328977cc3fe7ac10d5b239cdc225acbd9a74728882ad2fb5130742ace55ce76119393cb18a0b71d44f9f843290c6a1f34a7a279"

RPROVIDES:${PN} += "ghc-unix \
libHSunix-2.7.3-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
