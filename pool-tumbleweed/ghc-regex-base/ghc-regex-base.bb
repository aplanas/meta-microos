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

RPM_NAME = "ghc-regex-base-0.94.0.2-3.6.aarch64.rpm"
RPM_HASH = "8edbc89f696d9871c448571c1e089755d93a283cbbacbc0b73dd8766abfd109370486c64f45c24b190fe90cc52f829d28fe770da686bbe4377068c785cef141d"

RPROVIDES:${PN} += "ghc-regex-base \
libHSregex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
