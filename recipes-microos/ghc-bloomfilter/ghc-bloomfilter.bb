SUMMARY = "Pure and impure Bloom Filter implementations"
DESCRIPTION = "Pure and impure Bloom Filter implementations."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.0"

RPM_NAME = "ghc-bloomfilter-2.0.1.0-6.3.aarch64.rpm"
RPM_HASH = "9c546f3565e070aef00ba59e2d8bc8394ab3ebc5d51fd05ed3e76fa408628ae146b9b9fc41212354aae65fff53c209061a20cfd4c31c1b8c416c5f05140c060a"

RPROVIDES:${PN} += "ghc-bloomfilter ghc-bloomfilter(aarch-64) libHSbloomfilter-2.0.1.0-3hF1ySDPbPQA7KQQeHgCqI-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
