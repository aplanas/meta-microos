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

RPM_NAME = "ghc-regex-base-0.94.0.2-3.3.aarch64.rpm"
RPM_HASH = "02f01355892ac0f74e70b62e2072ebd8d7078a12ab465b97a8dd85342fb675ce297fa8613cce5fe33c2ae361239fcb7e690d3cfcf39ea3d5f8b5c31eced59fb9"

RPROVIDES:${PN} += "ghc-regex-base \
ghc-regex-base(aarch-64) \
libHSregex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
