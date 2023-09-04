SUMMARY = "Common 'Text.Regex.*' API for Regex matching"
DESCRIPTION = "This package does not provide the ability to do regular expression matching. \
Instead, it provides the type classes that constitute the abstract API that is \
implemented by 'regex-*' backends such as: \
 \
* <https://hackage.haskell.org/package/regex-posix regex-posix> \
 \
* <https://hackage.haskell.org/package/regex-parsec regex-parsec> \
 \
* <https://hackage.haskell.org/package/regex-dfa regex-dfa> \
 \
* <https://hackage.haskell.org/package/regex-tdfa regex-tdfa> \
 \
* <https://hackage.haskell.org/package/regex-pcre regex-pcre> \
 \
See also <https://wiki.haskell.org/Regular_expressions> for more information."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-0.94.0.2-4.3.aarch64.rpm"
RPM_HASH = "f4fdf31b6ee5c19fe74f8869e55dfdc3e464ea62a5fd76d0f8d6b6838bcc737a299e9d25dd185dfc349eeb13c913c71fbe944d0da2ccdca2840658e04ae8ed19"

RPROVIDES:${PN} += "ghc-regex-base \
libHSregex-base-0.94.0.2-Ac50cWDKNd7Gyvsho1Lmae-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
