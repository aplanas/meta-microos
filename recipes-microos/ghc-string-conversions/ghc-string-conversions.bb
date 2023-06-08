SUMMARY = "Simplifies dealing with different types for strings"
DESCRIPTION = "Provides a simple type class for converting values of different string types \
into values of other string types."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-string-conversions-0.4.0.1-3.2.aarch64.rpm"
RPM_HASH = "996a54aa3447f5a25aceead6655c2450304525a7b1aa373df0387fd23bc84030f31b0acf3fcaeb4cd5d9db49e4b5ee79f88fecb1552766fc6d4bc272750405ec"

RPROVIDES:${PN} += "ghc-string-conversions ghc-string-conversions(aarch-64) libHSstring-conversions-0.4.0.1-B4OFWvpC4GeAVPq9bBfwkx-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
