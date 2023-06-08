SUMMARY = "Haskell process library"
DESCRIPTION = "This package provides the Haskell process library."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-1.6.16.0-1.1.aarch64.rpm"
RPM_HASH = "aac14381ebda93a421e65f0d68fc1facca9bbd3be2c19554435d217026e6a87d573cd2f55064247295082e4cf836314f128ca301f524769c4de02f7a91b4bea8"

RPROVIDES:${PN} += "ghc-process ghc-process(aarch-64) libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
