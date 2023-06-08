SUMMARY = "Haskell ghc-compact library"
DESCRIPTION = "This package provides the Haskell ghc-compact library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-0.1.0.0-1.1.aarch64.rpm"
RPM_HASH = "9a36218926e40fd01bf3e61e31c234eadf9b6aa97526a0649780c3e6dbaaa138857c5b0b510c75d34f3155a22e42e401021aa5191186d018aaed55ca6551126f"

RPROVIDES:${PN} += "ghc-ghc-compact ghc-ghc-compact(aarch-64) libHSghc-compact-0.1.0.0-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
