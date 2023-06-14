SUMMARY = "POSIX Backend for 'Text.Regex' (regex-base)"
DESCRIPTION = "The POSIX regex backend for <//hackage.haskell.org/package/regex-base \
regex-base>. \
 \
The main appeal of this backend is that it's very lightweight due to its \
reliance on the ubiquitous \
<https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/regex.h.html POSIX.2 \
regex> facility that is provided by the standard C library on most POSIX \
platforms. \
 \
See also <https://wiki.haskell.org/Regular_expressions> for more information."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-0.96.0.1-3.3.aarch64.rpm"
RPM_HASH = "2512ab58aecd6a8b581469662f68572a934588d15ed34e9c62db939eff04a13b126717dddc6c355316200425f58be768e178019cc36b65fb6748b37bc881f5d8"

RPROVIDES:${PN} += "ghc-regex-posix \
libHSregex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1-ghc9.4.5.so"

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
libHSregex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
