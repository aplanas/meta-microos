SUMMARY = "Haskell binary library"
DESCRIPTION = "This package provides the Haskell binary library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-0.8.9.1-3.1.aarch64.rpm"
RPM_HASH = "12aaae5f4781ac66e9a19238743f498650de1557d5979872e82511a14b3f17d6613a0f335d5ed3d80637c2f4ed393336f124edd0f974b3ebc85b640f333714e1"

RPROVIDES:${PN} += "ghc-binary ghc-binary(aarch-64) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
